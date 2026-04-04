package com.zzy.travle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.zzy.travle.databinding.FragmentScenicSearchBinding;

public class ScenicSearchFragment extends BaseFragment<FragmentScenicSearchBinding> {

    public static final String TAG = "ScenicSearchFragment";

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
    protected FragmentScenicSearchBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentScenicSearchBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}