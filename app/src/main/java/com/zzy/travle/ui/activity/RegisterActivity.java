package com.zzy.travle.ui.activity;

import android.text.TextUtils;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.AccountManager;
import com.zzy.travle.data.manager.DataCallback;
import com.zzy.travle.data.manager.UserManager;
import com.zzy.travle.data.model.vo.UserVO;
import com.zzy.travle.databinding.ActivityRegisterBinding;
import com.zzy.travle.util.TravelToast;

public class RegisterActivity extends BaseActivity<ActivityRegisterBinding> {

    public static final String TAG = "RegisterActivity";
    private final UserManager mUserManager = new UserManager();
    private final RegisterCallback mRegisterCallback = new RegisterCallback();

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected void initView() {
        mBinding.ivBack.setOnClickListener(v -> finish());
        mBinding.tvRegister.setOnClickListener(v -> handleRegister());

        mBinding.tvGoLogin.setOnClickListener(v -> finish());
    }

    private void handleRegister() {
        String username = mBinding.etUsername.getText().toString().trim();
        String password = mBinding.etPassword.getText().toString().trim();
        String email = mBinding.etEmail.getText().toString().trim();

        if (TextUtils.isEmpty(username)) {
            TravelToast.showToast(this, "请输入账号");
            return;
        }

        if (TextUtils.isEmpty(password)) {
            TravelToast.showToast(this, "请输入密码");
            return;
        }

        mUserManager.register(username, password, email, mRegisterCallback);
    }

    private void autoLoginAfterRegister() {
        String username = mBinding.etUsername.getText().toString().trim();
        String password = mBinding.etPassword.getText().toString().trim();
        String email = mBinding.etEmail.getText().toString().trim();

        mUserManager.login(username, password, new DataCallback<UserVO>() {
            @Override
            public void onSuccess(UserVO data) {
                AccountManager.getInstance().saveLoginInfo(data);
                finish();
            }

            @Override
            public void onError(String error) {
                TravelToast.showToast(RegisterActivity.this, "自动登录失败，请手动登录");
                finish();
            }
        });
    }

    private class RegisterCallback implements DataCallback<Boolean> {

        @Override
        public void onSuccess(Boolean data) {
            TravelToast.showToast(RegisterActivity.this, "注册成功,即将自动登录");
            autoLoginAfterRegister();
            finish();
        }

        @Override
        public void onError(String error) {
            TravelToast.showToast(RegisterActivity.this, "注册失败：" + error);
        }
    }

}