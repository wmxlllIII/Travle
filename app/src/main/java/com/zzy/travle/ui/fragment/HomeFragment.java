package com.zzy.travle.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentHomeBinding;
import com.zzy.travle.ui.activity.SearchActivity;

public class HomeFragment extends BaseFragment<FragmentHomeBinding> {

    public static final String TAG = "HomeFragment";


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
        mBinding.llSearchBarZone.setOnClickListener(v->{
            Intent intent = new Intent(getActivity(), SearchActivity.class);
            startActivity(intent);
        });
        mBinding.tvTemp.setText(getString(R.string.weather,10,18));
    }

    @Override
    protected void initData() {

    }
}