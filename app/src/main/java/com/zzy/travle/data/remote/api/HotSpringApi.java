package com.zzy.travle.data.remote.api;

import com.zzy.travle.data.model.vo.HotSpringVO;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface HotSpringApi {

    @GET("/hot/list")
    Call<ApiResponse<List<HotSpringVO>>> getHotSpringList();

    @GET("/hot/detail/")
    Call<ApiResponse<HotSpringVO>> getHotSpringDetail(@Query("hotSpringId") Long hotSpringId);

}
