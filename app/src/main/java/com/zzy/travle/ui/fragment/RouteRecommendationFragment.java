package com.zzy.travle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.tabs.TabLayout;
import com.zzy.travle.databinding.FragmentRouteRecommendationBinding;

public class RouteRecommendationFragment extends BaseFragment<FragmentRouteRecommendationBinding> {

    public static final String TAG = "RouteRecommendationFragment";
    private final TabSelectedListener mTabSelectedListener = new TabSelectedListener();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentRouteRecommendationBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentRouteRecommendationBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {
        mBinding.rvRouteList.setLayoutManager(new LinearLayoutManager(getContext()));

        mBinding.tabLayoutCategory.addOnTabSelectedListener(mTabSelectedListener);
    }

    @Override
    protected void initData() {
        loadCategories();
        loadRouteList();
    }

    private void loadCategories() {
        mBinding.tabLayoutCategory.removeAllTabs();
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("全部"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("一日游"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("两日游"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("多日游"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("主题路线"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("亲子游"));
    }

    private void loadRouteList() {
    }

    private void loadRoutesByCategory(int categoryIndex) {
        String selectedCategory = mBinding.tabLayoutCategory.getTabAt(categoryIndex).getText().toString();
    }

    private class TabSelectedListener implements TabLayout.OnTabSelectedListener {

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            loadRoutesByCategory(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    }
}