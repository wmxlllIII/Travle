package com.zzy.travle.data.remote.api;

import com.zzy.travle.data.model.respdto.WeatherRespDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface WeatherApi {
    @GET("v3/weather/weatherInfo")
    Call<WeatherRespDto> getWeatherInfo(
            @Query("city") String city,
            @Query("extensions") String extensions,
            @Query("output") String output,
            @Query("key") String key
    );
}
