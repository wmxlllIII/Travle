package com.zzy.travle.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentTravelGuideBinding;

public class TravelGuideFragment extends BaseFragment<FragmentTravelGuideBinding> {

    public static final String TAG = "TravelGuideFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return mBinding.getRoot();
    }

    @Override
    protected FragmentTravelGuideBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentTravelGuideBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}