package com.zzy.travle.data.manager;

import android.os.Handler;
import android.os.Looper;

import com.zzy.travle.data.model.vo.HomeDataVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.data.model.vo.WeatherVO;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.repository.SpotRepositoryImpl;
import com.zzy.travle.util.ThreadPoolProvider;

import java.util.List;

public class SpotManager {

    public static final String TAG = "HomeManager";
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final SpotRepositoryImpl spotRepository = new SpotRepositoryImpl();

    public void loadHomeData(DataCallback<HomeDataVO> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<HomeDataVO> result = spotRepository.getHomeData();

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void loadScenicList(DataCallback<List<ScenicSpotVO>> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<List<ScenicSpotVO>> result = spotRepository.getScenicSpot();

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void loadWeather(DataCallback<WeatherVO> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<WeatherVO> result = spotRepository.getWeather();

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void searchSpotByKeyword(String keyword, DataCallback<List<ScenicSpotVO>> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<List<ScenicSpotVO>> result = spotRepository.searchScenicSpot(keyword);

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void loadStrategy(DataCallback<List<StrategyVO>> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {

        });
    }

}
