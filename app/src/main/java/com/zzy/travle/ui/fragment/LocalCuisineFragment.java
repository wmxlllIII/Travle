package com.zzy.travle.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.zzy.travle.R;
import com.zzy.travle.databinding.FragmentLocalCuisineBinding;

public class LocalCuisineFragment extends BaseFragment<FragmentLocalCuisineBinding> {

    public static final String TAG = "LocalCuisineFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentLocalCuisineBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentLocalCuisineBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }
}