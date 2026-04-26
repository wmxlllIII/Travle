package com.zzy.travle.ui.activity;

import android.content.Intent;
import android.view.View;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.AccountManager;
import com.zzy.travle.databinding.ActivitySettingBinding;
import com.zzy.travle.util.TravelToast;

public class SettingActivity extends BaseActivity<ActivitySettingBinding> {

    public static final String TAG = "SettingActivity";

    @Override
    protected int getLayoutId() {
        return R.layout.activity_setting;
    }

    @Override
    protected void initView() {
        mBinding.tvLogout.setVisibility(AccountManager.getInstance().hasToken() ? View.VISIBLE : View.GONE);
        mBinding.tvLogout.setOnClickListener(v -> {
            handleLogout();
        });
        mBinding.ivBack.setOnClickListener(v -> finish());

        mBinding.llAccountSecurity.setOnClickListener(v -> {
            TravelToast.showToast(this, "即将开发账号与安全");
        });

        mBinding.llPrivacy.setOnClickListener(v -> {
            TravelToast.showToast(this, "即将开发隐私设置");
        });

        mBinding.llNotification.setOnClickListener(v -> {
            TravelToast.showToast(this, "即将开发消息通知");
        });

        mBinding.llClearCache.setOnClickListener(v -> {
//            clearCache();
        });

        mBinding.llAbout.setOnClickListener(v -> {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        });
    }

    private void handleLogout() {
        AccountManager.getInstance().logout();
        TravelToast.showToast(this, "已退出登录");

        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        finish();
    }
}