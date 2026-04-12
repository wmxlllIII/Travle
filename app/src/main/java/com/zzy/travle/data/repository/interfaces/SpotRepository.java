package com.zzy.travle.data.repository.interfaces;

import com.zzy.travle.data.model.vo.HomeDataVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.data.model.vo.WeatherVO;
import com.zzy.travle.data.remote.common.Result;

import java.util.List;

public interface SpotRepository {

    Result<HomeDataVO> getHomeData();

    Result<List<ScenicSpotVO>> getScenicSpot();

    Result<WeatherVO> getWeather();
}
