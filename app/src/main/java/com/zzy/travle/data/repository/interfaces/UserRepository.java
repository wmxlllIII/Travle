package com.zzy.travle.data.repository.interfaces;

import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.data.remote.common.Result;

public interface UserRepository {
    boolean registerUser(String username, String password, String email);

    // 用户登录
    Result<UserVO> loginUser(String username, String password);

    // 用户登出
    void logoutUser();

    // 获取用户信息
    UserVO getUserInfo();

    // 更新用户信息
//    boolean updateUserInfo(User user);

    // 修改密码
    boolean changePassword(String oldPassword, String newPassword);

    // 重置密码
    boolean resetPassword(String email);

    // 检查用户名是否已注册
    boolean checkUsernameExists(String username);

    // 检查邮箱是否已注册
    boolean checkEmailExists(String email);

}
