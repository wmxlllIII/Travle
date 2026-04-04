package com.zzy.travle.data.repository;

import com.zzy.travle.data.model.mapper.UserMapper;
import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.data.remote.api.AuthApi;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.remote.network.RetrofitFactory;
import com.zzy.travle.data.repository.interfaces.UserRepository;

public class UserRepositoryImpl implements UserRepository {

    private final AuthApi authApi = RetrofitFactory.get().create(AuthApi.class);
    private final UserMapper mapper = new UserMapper();

    @Override
    public boolean registerUser(String username, String password, String email) {
        return false;
    }

    @Override
    public Result<UserVO> loginUser(String username, String password) {
        return null;
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
