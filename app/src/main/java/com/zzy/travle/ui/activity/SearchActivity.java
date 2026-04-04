package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivitySearchBinding;

public class SearchActivity extends BaseActivity<ActivitySearchBinding> {

    public static final String TAG = "SearchActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }
}