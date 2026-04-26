package com.zzy.travle.ui.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;


public abstract class BaseActivity<T extends ViewDataBinding>
        extends AppCompatActivity {

    public static final String TAG = "BaseActivity";

    protected T mBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        mBinding = DataBindingUtil.setContentView(
                this,
                getLayoutId()
        );

        ViewCompat.setOnApplyWindowInsetsListener(mBinding.getRoot(), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        mBinding.setLifecycleOwner(this);

        initView();
        initData();
    }

    protected abstract int getLayoutId();

    protected void initView() {
    }

    protected void initData() {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mBinding = null;
    }
}
