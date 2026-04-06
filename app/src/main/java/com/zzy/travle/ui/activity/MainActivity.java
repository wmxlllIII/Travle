package com.zzy.travle.ui.activity;

import android.os.Bundle;
import android.util.Log;

import androidx.fragment.app.Fragment;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityMainBinding;
import com.zzy.travle.ui.fragment.HomeFragment;
import com.zzy.travle.ui.fragment.MineFragment;
import com.zzy.travle.ui.fragment.RouteRecommendationFragment;
import com.zzy.travle.ui.fragment.ScenicSpotListFragment;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    public static final String TAG = "MainActivity";
    private Fragment homeFragment;
    private Fragment scenicSpotFragment;
    private Fragment routeRecomFragment;
    private Fragment mineFragment;
    private Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        initFragments();
        initNavigation();
    }

    @Override
    protected void initData() {
        super.initData();
    }

    private void initFragments() {
        homeFragment = new HomeFragment();
        scenicSpotFragment = new ScenicSpotListFragment();
        routeRecomFragment = new RouteRecommendationFragment();
        mineFragment = new MineFragment();
        getSupportFragmentManager().beginTransaction()
                .add(R.id.fl_container, homeFragment)
                .add(R.id.fl_container, scenicSpotFragment).hide(scenicSpotFragment)
                .add(R.id.fl_container, routeRecomFragment).hide(routeRecomFragment)
                .add(R.id.fl_container, mineFragment).hide(mineFragment)
                .commit();

        currentFragment = homeFragment;
    }

    private void switchFragment(Fragment target) {
        if (currentFragment == target) {
            Log.d(TAG, "[x] switchFragment #75");
            return;
        }

        getSupportFragmentManager()
                .beginTransaction()
                .hide(currentFragment)
                .show(target)
                .commit();

        currentFragment = target;
    }

    private void initNavigation() {
        mBinding.navBar.llHomePage.setOnClickListener(v -> switchFragment(homeFragment));
        mBinding.navBar.llScenicPage.setOnClickListener(v -> switchFragment(scenicSpotFragment));
        mBinding.navBar.llRoutePage.setOnClickListener(v -> switchFragment(routeRecomFragment));
        mBinding.navBar.llMinePage.setOnClickListener(v -> switchFragment(mineFragment));
    }

}