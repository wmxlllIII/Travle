package com.zzy.travle.data.repository;

import com.zzy.travle.data.model.mapper.UserMapper;
import com.zzy.travle.data.model.reqdto.LoginReqDto;
import com.zzy.travle.data.model.reqdto.RegisterReqDto;
import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.data.remote.api.AuthApi;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.remote.network.NetworkHelper;
import com.zzy.travle.data.remote.network.RetrofitFactory;
import com.zzy.travle.data.repository.interfaces.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    private final AuthApi authApi = RetrofitFactory.get().create(AuthApi.class);
    private final UserMapper mapper = new UserMapper();

    @Override
    public Result<Boolean> registerUser(String username, String password, String email) {
        RegisterReqDto reqDto = new RegisterReqDto(username, password, email);
        Result<Boolean> result = NetworkHelper.executeCall(() -> authApi.register(reqDto));

        if (result.isSuccess()) {
            return Result.success(true);
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public Result<UserVO> loginUser(String username, String password) {
        LoginReqDto reqDto = new LoginReqDto(username, password);
        Result<com.zzy.travle.data.model.respdto.LoginRespDto> result =
                NetworkHelper.executeCall(() -> authApi.login(reqDto));

        if (result.isSuccess()) {
            UserVO userVO = mapper.mapLoginRespToVO(result.getData());
            return Result.success(userVO);
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public Result<UserVO> autoLogin(String token) {
        Result<com.zzy.travle.data.model.respdto.LoginRespDto> result =
                NetworkHelper.executeCall(() -> authApi.autoLogin("Bearer " + token));

        if (result.isSuccess()) {
            UserVO userVO = mapper.mapLoginRespToVO(result.getData());
            return Result.success(userVO);
        } else {
            return Result.error(result.getError());
        }
    }

    @Override
    public void logoutUser() {

    }

    @Override
    public UserVO getUserInfo() {
        return null;
    }

    @Override
    public boolean changePassword(String oldPassword, String newPassword) {
        return false;
    }

    @Override
    public boolean resetPassword(String email) {
        return false;
    }

    @Override
    public boolean checkUsernameExists(String username) {
        return false;
    }

    @Override
    public boolean checkEmailExists(String email) {
        return false;
    }
}
