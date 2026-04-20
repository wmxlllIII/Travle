package com.zzy.travle.data.model.mapper;

import android.util.Log;

import com.zzy.travle.data.model.respdto.WeatherRespDto;
import com.zzy.travle.data.model.vo.WeatherVO;

public class WeatherMapper {
    public static final String TAG = "WeatherMapper";

    public WeatherVO mapWeatherToVO(WeatherRespDto respDto) {
        if (respDto == null || respDto.getForecasts() == null || respDto.getForecasts().isEmpty()) {
            Log.d(TAG, "[x] 天气数据为空");
            return null;
        }

        // 第一个城市预报
        WeatherRespDto.Forecast forecast = respDto.getForecasts().get(0);
        if (forecast.getCasts() == null || forecast.getCasts().isEmpty()) {
            return null;
        }

        // 今日天气
        WeatherRespDto.Cast today = forecast.getCasts().get(0);

        // 温度解析
        int maxTemp = parseIntSafe(today.getDaytemp());
        int minTemp = parseIntSafe(today.getNighttemp());
        int currentTemp = minTemp; // 没有实时温度就用最低温（你也可以自己处理）

        return new WeatherVO(
                forecast.getCity(),
                currentTemp,
                maxTemp,
                minTemp,
                today.getDayweather(),
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
