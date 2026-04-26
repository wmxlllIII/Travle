package com.zzy.travle.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.zzy.travle.R;
import com.zzy.travle.data.manager.DataCallback;
import com.zzy.travle.data.manager.SpotManager;
import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.databinding.ActivityStrategyBinding;
import com.zzy.travle.ui.adapter.StrategyAdapter;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;

import java.util.List;

public class StrategyActivity extends BaseActivity<ActivityStrategyBinding> {

    public static final String TAG = "StrategyActivity";
    private final StrategyAdapter mAdapter = new StrategyAdapter(new OnStrategyClickListenerImpl());
    private final SpotManager mSpotManager = new SpotManager();
    private final LoadStrategyCallback mLoadStrategyCallback = new LoadStrategyCallback();

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
        mBinding.rvStrategyList.setLayoutManager(new LinearLayoutManager(this));
        mBinding.rvStrategyList.setAdapter(mAdapter);

        mBinding.ivBack.setOnClickListener(v -> finish());
        mBinding.ivPublish.setOnClickListener(v -> {
            Intent intent = new Intent(this, StrategyPublishActivity.class);
            startActivity(intent);
        });
    }

    @Override
    protected void initData() {
        super.initData();
        loadStrategyList();
    }

    private void loadStrategyList() {
        mSpotManager.loadStrategy(mLoadStrategyCallback);
    }

    private class OnStrategyClickListenerImpl implements OnStrategyClickListener {
        //todo 待实现
    }

    private class LoadStrategyCallback implements DataCallback<List<StrategyVO>> {
        @Override
        public void onSuccess(List<StrategyVO> data) {
            mAdapter.submitList(data);
        }

        @Override
        public void onError(String error) {

        }
    }

}