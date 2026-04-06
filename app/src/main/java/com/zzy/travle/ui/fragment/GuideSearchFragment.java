package com.zzy.travle.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentGuideSearchBinding;

public class GuideSearchFragment extends BaseFragment<FragmentGuideSearchBinding> {

    public static final String TAG = "GuideSearchFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentGuideSearchBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentGuideSearchBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}