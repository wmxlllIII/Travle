package com.zzy.travle.ui.fragment;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.LinearLayoutManager;

import com.google.android.material.tabs.TabLayout;
import com.zzy.travle.databinding.FragmentScenicSpotListBinding;

public class ScenicSpotListFragment extends BaseFragment<FragmentScenicSpotListBinding> {

    public static final String TAG = "ScenicSpotListFragment";
    private final TabSelectedListener mTabSelectedListener = new TabSelectedListener();
    private final SearchTextWatcher mSearchTextWatcher = new SearchTextWatcher();
    //todo 缺数据，待实现
//    private final ScenicSpotListAdapter mScenicSpotListAdapter = new ScenicSpotListAdapter();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected FragmentScenicSpotListBinding inflateBinding(LayoutInflater inflater, ViewGroup container) {
        return FragmentScenicSpotListBinding.inflate(inflater, container, false);
    }

    @Override
    protected void initView() {
        mBinding.rvScenicList.setLayoutManager(new LinearLayoutManager(getContext()));

        mBinding.etSearch.addTextChangedListener(mSearchTextWatcher);

        mBinding.ivClearSearch.setOnClickListener(v -> {
            mBinding.etSearch.setText("");
        });

        mBinding.tabLayoutCategory.addOnTabSelectedListener(mTabSelectedListener);

    }

    @Override
    protected void initData() {
        loadCategories();
        loadScenicList();
    }

    private void loadCategories() {
        mBinding.tabLayoutCategory.removeAllTabs();
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("全部"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("自然风光"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("人文历史"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("主题乐园"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("博物馆"));
        mBinding.tabLayoutCategory.addTab(mBinding.tabLayoutCategory.newTab().setText("公园"));
    }

    private void loadScenicList() {
    }

    private void loadScenicByCategory(int categoryIndex) {
        String selectedCategory = mBinding.tabLayoutCategory.getTabAt(categoryIndex).getText().toString();

    }

    private class SearchTextWatcher implements TextWatcher {

        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            if (s.length() > 0) {
                mBinding.ivClearSearch.setVisibility(View.VISIBLE);
            } else {
                mBinding.ivClearSearch.setVisibility(View.GONE);
            }
        }

        @Override
        public void afterTextChanged(Editable s) {

        }
    }

    private class TabSelectedListener implements TabLayout.OnTabSelectedListener {

        @Override
        public void onTabSelected(TabLayout.Tab tab) {
            loadScenicByCategory(tab.getPosition());
        }

        @Override
        public void onTabUnselected(TabLayout.Tab tab) {

        }

        @Override
        public void onTabReselected(TabLayout.Tab tab) {

        }
    }
}