package com.zzy.travle.ui.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentTransportationRouteBinding;

public class TransportationRouteFragment extends BaseFragment<FragmentTransportationRouteBinding> {

    public static final String TAG = "TransportationRouteFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentTransportationRouteBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentTransportationRouteBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}