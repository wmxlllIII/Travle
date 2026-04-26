package com.zzy.travle.data.repository.interfaces;

import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.data.remote.common.Result;

public interface UserRepository {
    Result<Boolean> registerUser(String username, String password, String email);

    Result<UserVO> loginUser(String username, String password);

    Result<UserVO> autoLogin(String token);

    void logoutUser();

    UserVO getUserInfo();

//    boolean updateUserInfo(User user);

    boolean changePassword(String oldPassword, String newPassword);

    boolean resetPassword(String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);

}
