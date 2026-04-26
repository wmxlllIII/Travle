package com.zzy.travle.data.manager;

import android.os.Handler;
import android.os.Looper;

import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.repository.UserRepositoryImpl;
import com.zzy.travle.data.repository.interfaces.UserRepository;
import com.zzy.travle.util.ThreadPoolProvider;

public class UserManager {

    public static final String TAG = "UserManager";
    private final UserRepository userRepository = new UserRepositoryImpl();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public void login(String username, String password, DataCallback<UserVO> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<UserVO> result = userRepository.loginUser( username, password);

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void autoLogin(String token, DataCallback<UserVO> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<UserVO> result = userRepository.autoLogin(token);

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void register(String username, String password, String email, DataCallback<Boolean> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<Boolean> result = userRepository.registerUser(username, password, email);

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }
}
