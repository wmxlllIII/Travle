package com.zzy.travle.data.remote.api;

import com.zzy.travle.data.model.reqdto.SearchSpotReqDTO;
import com.zzy.travle.data.model.respdto.HomeDataRespDto;
import com.zzy.travle.data.model.respdto.ScenicSpotListRespDto;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface SpotApi {

    @GET("/spot/homeData")
    Call<ApiResponse<HomeDataRespDto>> getHomeData();

    @GET("/spot/list")
    Call<ApiResponse<ScenicSpotListRespDto>> getScenicSpotList();

    @GET("")
    Call<ApiResponse<ScenicSpotListRespDto>> getWeather();

    @POST("/spot/search")
    Call<ApiResponse<ScenicSpotListRespDto>> searchSpot(SearchSpotReqDTO reqDTO);
}
