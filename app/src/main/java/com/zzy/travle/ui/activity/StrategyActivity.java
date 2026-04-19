package com.zzy.travle.ui.activity;

import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivityStrategyBinding;
import com.zzy.travle.ui.adapter.StrategyAdapter;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;
import com.zzy.travle.util.TravleToast;

public class StrategyActivity extends BaseActivity<ActivityStrategyBinding> {

    public static final String TAG = "StrategyActivity";
    private final StrategyAdapter mAdapter = new StrategyAdapter(new OnStrategyClickListenerImpl());
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_strategy;
    }

    @Override
    protected void initView() {
        super.initView();
        mBinding.rvStrategyList.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rvStrategyList.setAdapter(mAdapter);

        mBinding.ivBack.setOnClickListener(v -> finish());
        mBinding.ivPublish.setOnClickListener(v -> {
            TravleToast.showToast(this, "发布功能待实现");
        });
    }

    @Override
    protected void initData() {
        super.initData();
        loadStrategyList();
    }

    private void loadStrategyList() {
        //todo 待实现
    }
    private class OnStrategyClickListenerImpl implements OnStrategyClickListener {
        //todo 待实现
    }
}