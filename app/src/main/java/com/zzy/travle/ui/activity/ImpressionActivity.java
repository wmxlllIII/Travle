package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityImprssionBinding;

public class ImpressionActivity extends BaseActivity<ActivityImprssionBinding> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_imprssion;
    }

    @Override
    protected void initView() {
        super.initView();
        mBinding.ivBack.setOnClickListener(v -> finish());
    }
}