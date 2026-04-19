package com.zzy.travle.data.repository;

import android.util.Log;

import com.zzy.travle.data.constant.Constants;
import com.zzy.travle.data.model.mapper.SpotMapper;
import com.zzy.travle.data.model.mapper.WeatherMapper;
import com.zzy.travle.data.model.reqdto.SearchSpotReqDTO;
import com.zzy.travle.data.model.respdto.HomeDataRespDto;
import com.zzy.travle.data.model.respdto.ScenicSpotListRespDto;
import com.zzy.travle.data.model.respdto.WeatherRespDto;
import com.zzy.travle.data.model.vo.HomeDataVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.data.model.vo.WeatherVO;
import com.zzy.travle.data.remote.api.SpotApi;
import com.zzy.travle.data.remote.api.WeatherApi;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.remote.network.NetworkHelper;
import com.zzy.travle.data.remote.network.RetrofitFactory;
import com.zzy.travle.data.repository.interfaces.SpotRepository;

import java.util.ArrayList;
import java.util.List;

public class SpotRepositoryImpl implements SpotRepository {

    public static final String TAG = "SpotRepositoryImpl";
    private final SpotApi spotApi = RetrofitFactory.get().create(SpotApi.class);
    private final WeatherApi weatherApi = RetrofitFactory.getWeather().create(WeatherApi.class);
    private final SpotMapper mapper = new SpotMapper();
    private final WeatherMapper weatherMapper = new WeatherMapper();

    @Override
    public Result<HomeDataVO> getHomeData() {
        Result<HomeDataRespDto> result = NetworkHelper.executeCall(spotApi::getHomeData);

        if (result.isSuccess()) {
            HomeDataRespDto dto = result.getData();
            HomeDataVO vo = new HomeDataVO(mapper.mapRecommendationListDOToVO(dto.getRecommendations()));
            return Result.success(vo);
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public Result<List<ScenicSpotVO>> getScenicSpot() {
        Result<ScenicSpotListRespDto> result = NetworkHelper.executeCall(spotApi::getScenicSpotList);
        Log.d(TAG, "[t] getScenicSpot #47" + result);

        if (result.isSuccess()) {
            ScenicSpotListRespDto dto = result.getData();
            List<ScenicSpotVO> voList = mapper.mapScenicSpotListDOToVO(dto.getSpots());
            return Result.success(voList);
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public Result<WeatherVO> getWeather() {
        Result<WeatherRespDto> result = NetworkHelper.executeExternalCall(() ->
                weatherApi.getWeatherInfo(
                        Constants.SHENYANG_CITY_CODE,
                        "base",
                        "JSON",
                        Constants.AMAP_WEATHER_KEY
                )
        );

        if (result.isSuccess()) {
            WeatherRespDto dto = result.getData();
            if ("1".equals(dto.getStatus())) {
                WeatherVO vo = weatherMapper.mapWeatherToVO(dto);
                if (vo != null) {
                    return Result.success(vo);
                } else {
                    return Result.error("天气数据解析失败");
                }
            } else {
                return Result.error(dto.getInfo());
            }
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public Result<List<ScenicSpotVO>> searchScenicSpot(String keyword) {
        SearchSpotReqDTO reqDTO = new SearchSpotReqDTO();
        reqDTO.setKeyword(keyword);

        Result<ScenicSpotListRespDto> result = NetworkHelper.executeCall(() -> spotApi.searchSpot(reqDTO));

        if (!result.isSuccess()) {
            return Result.error(result.getError());
        }

        ScenicSpotListRespDto dto = result.getData();
        if (dto == null || dto.getSpots() == null) {
            return Result.success(new ArrayList<>());
        }

        List<ScenicSpotVO> voList = mapper.mapScenicSpotListDOToVO(dto.getSpots());
        return Result.success(voList);
    }
}
