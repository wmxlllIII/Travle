package com.zzy.travle.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.DataCallback;
import com.zzy.travle.data.manager.SpotManager;
import com.zzy.travle.data.model.vo.HomeDataVO;
import com.zzy.travle.data.model.vo.RecommendationItemVO;
import com.zzy.travle.data.model.vo.WeatherVO;
import com.zzy.travle.databinding.FragmentHomeBinding;
import com.zzy.travle.ui.activity.ImpressionActivity;
import com.zzy.travle.ui.activity.SearchActivity;
import com.zzy.travle.ui.activity.StrategyActivity;

import java.util.List;

public class HomeFragment extends BaseFragment<FragmentHomeBinding> {

    public static final String TAG = "HomeFragment";
    private final SpotManager mHomeManager = new SpotManager();
    private final HomeDataCallback mHomeDataCallback = new HomeDataCallback();
    private final WeatherCallback mWeatherCallback = new WeatherCallback();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentHomeBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentHomeBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {
        mBinding.llSearchBarZone.setOnClickListener(v -> {
            Intent intent = new Intent(getActivity(), SearchActivity.class);
            startActivity(intent);
        });
        mBinding.rvRecom.setLayoutManager(new LinearLayoutManager(getContext()));
        mBinding.llImpression.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ImpressionActivity.class);
            startActivity(intent);
        });

        mBinding.llStrategy.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), StrategyActivity.class);
            startActivity(intent);
        });

    }

    @Override
    protected void initData() {
        loadHomeData();
    }

    private void loadHomeData() {
        showLoading();
        mHomeManager.loadHomeData(mHomeDataCallback);
        mHomeManager.loadWeather(mWeatherCallback);
    }

    private void _proHomeData(HomeDataVO homeData) {
        handleRecommendation(homeData.getRecommendations());
        hideLoading();
    }

    private void handleWeather(WeatherVO weather) {
        if (weather == null) {
            Log.d(TAG, "[x] handleWeather #70");
            return;
        }

        mBinding.tvTemp.setText(getString(
                R.string.weather,
                weather.getMinTemp(),
                weather.getMaxTemp()
        ));
    }

    private void handleRecommendation(List<RecommendationItemVO> recommendations) {
        if (recommendations.isEmpty()) {
            Log.d(TAG, "[x] handleRecommendation #83");
            return;
        }

    }

    private void handleError(String error, String tag) {
        Log.d(TAG, "[x] handleError " + tag + error);
        hideLoading();
//        TravleToast.showToast(getContext(), error);
    }

    private void showLoading() {
        mBinding.nestedScrollView.setEnabled(false);
    }

    private void hideLoading() {
        mBinding.nestedScrollView.setEnabled(true);
    }

    private class HomeDataCallback implements DataCallback<HomeDataVO> {

        @Override
        public void onSuccess(HomeDataVO homeData) {
            if (homeData == null) {
                Log.d(TAG, "[x] HomeDataCallback #115");
                handleError("数据为空", "#107");
                return;
            }

            _proHomeData(homeData);
        }

        @Override
        public void onError(String error) {
            handleError(error, "#116");
        }
    }

    private class WeatherCallback implements DataCallback<WeatherVO> {

        @Override
        public void onSuccess(WeatherVO data) {
            handleWeather(data);
        }

        @Override
        public void onError(String error) {
            handleError(error, "#129");
        }
    }

}