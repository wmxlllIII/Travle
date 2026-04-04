package com.zzy.travle.ui.activity;

import android.os.Bundle;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityAccommodationBinding;

public class AccommodationActivity extends BaseActivity<ActivityAccommodationBinding> {

    public static final String TAG = "AccommodationActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_accommodation;
    }
}