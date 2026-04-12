package com.zzy.travle.data.model.mapper;

import android.util.Log;

import com.zzy.travle.data.model.respdto.WeatherRespDto;
import com.zzy.travle.data.model.vo.WeatherVO;

public class WeatherMapper {
    public static final String TAG = "WeatherMapper";

    public WeatherVO mapWeatherToVO(WeatherRespDto respDto) {
        if (respDto == null || respDto.getLives() == null || respDto.getLives().length == 0) {
            Log.d(TAG, "[x] mapWeatherToVO #13");
            return null;
        }

        WeatherRespDto.LifeItem life = respDto.getLives()[0];

        int currentTemp = parseIntSafe(life.getTemperature());

        return new WeatherVO(
                life.getCity(),
                currentTemp,
                currentTemp,
                currentTemp,
                life.getWeather(),
                ""
        );
    }

    private int parseIntSafe(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
