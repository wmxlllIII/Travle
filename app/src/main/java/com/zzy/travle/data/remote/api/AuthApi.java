package com.zzy.travle.data.remote.api;

import com.zzy.travle.data.model.reqdto.LoginReqDto;
import com.zzy.travle.data.model.reqdto.RegisterReqDto;
import com.zzy.travle.data.model.respdto.LoginRespDto;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface AuthApi {

    @POST("/user/login")
    Call<ApiResponse<LoginRespDto>> login(@Body LoginReqDto reqDto);

    @POST("/user/register")
    Call<ApiResponse<Boolean>> register(@Body RegisterReqDto reqDto);

    @POST("/user/autoLogin")
    Call<ApiResponse<LoginRespDto>> autoLogin(@Header("Authorization") String token);
}
