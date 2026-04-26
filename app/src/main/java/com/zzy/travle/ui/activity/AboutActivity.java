package com.zzy.travle.ui.activity;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityAboutBinding;

public class AboutActivity extends BaseActivity<ActivityAboutBinding> {

    public static final String TAG = "AboutActivity";

    @Override
    protected int getLayoutId() {
        return R.layout.activity_about;
    }

    @Override
    protected void initView() {
        mBinding.ivBack.setOnClickListener(v -> finish());
    }
}