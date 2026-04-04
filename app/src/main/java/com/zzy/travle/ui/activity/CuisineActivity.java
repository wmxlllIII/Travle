package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityCuisineBinding;

public class CuisineActivity extends BaseActivity<ActivityCuisineBinding> {

    public static final String TAG = "CuisineActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_cuisine;
    }
}