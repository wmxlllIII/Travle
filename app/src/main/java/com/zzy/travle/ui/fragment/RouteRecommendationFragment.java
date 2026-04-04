package com.zzy.travle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.databinding.FragmentRouteRecommendationBinding;

public class RouteRecommendationFragment extends BaseFragment<FragmentRouteRecommendationBinding> {

    public static final String TAG = "RouteRecommendationFragment";

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
    protected FragmentRouteRecommendationBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentRouteRecommendationBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}