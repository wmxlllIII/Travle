package com.zzy.travle.ui.activity;

import android.content.Intent;
import android.text.TextUtils;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.AccountManager;
import com.zzy.travle.data.manager.DataCallback;
import com.zzy.travle.data.manager.UserManager;
import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.databinding.ActivityLoginBinding;
import com.zzy.travle.util.TravelToast;

public class LoginActivity extends BaseActivity<ActivityLoginBinding> {

    public static final String TAG = "LoginActivity";
    private final UserManager mUserManager = new UserManager();
    private final LoginCallback mLoginCallback = new LoginCallback();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mBinding.ivBack.setOnClickListener(v -> finish());
        mBinding.tvLogin.setOnClickListener(v -> handleLogin());

        mBinding.tvGoRegister.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void initData() {

    }

    private void handleLogin() {
        String username = mBinding.etAccount.getText().toString().trim();
        String password = mBinding.etPassword.getText().toString().trim();

        if (TextUtils.isEmpty(username)) {
            TravelToast.showToast(this, "请输入用户名");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            TravelToast.showToast(this, "请输入密码");
            return;
        }
        mUserManager.login(username, password, mLoginCallback);
    }

    private class LoginCallback implements DataCallback<UserVO> {

        @Override
        public void onSuccess(UserVO user) {
            AccountManager.getInstance().saveLoginInfo(user);
            TravelToast.showToast(LoginActivity.this, "登录成功");
            finish();
        }

        @Override
        public void onError(String error) {
            TravelToast.showToast(LoginActivity.this, "登录失败" + error);
        }
    }

}