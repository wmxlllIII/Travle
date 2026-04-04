package com.zzy.travle.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentSpecialAccommodationBinding;

public class SpecialAccommodationFragment extends BaseFragment<FragmentSpecialAccommodationBinding> {

    public static final String TAG = "SpecialAccommodationFragment";

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
    protected FragmentSpecialAccommodationBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentSpecialAccommodationBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}