package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityRouteBinding;

public class RouteActivity extends BaseActivity<ActivityRouteBinding> {

    public static final String TAG = "RouteActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_route;
    }
}