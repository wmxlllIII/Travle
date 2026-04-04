package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityScenicSpotBinding;

public class ScenicSpotActivity extends BaseActivity<ActivityScenicSpotBinding> {

    public static final String TAG = "ScenicSpotActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_scenic_spot;
    }
}