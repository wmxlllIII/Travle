package com.zzy.travle.ui.activity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.core.content.ContextCompat;

import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.zzy.travle.R;
import com.zzy.travle.databinding.ActivitySearchBinding;

public class SearchActivity extends BaseActivity<ActivitySearchBinding> {

    public static final String TAG = "SearchActivity";
    private final SearchTextWatcher mSearchTextWatcher = new SearchTextWatcher();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_search;
    }

    @Override
    protected void initView() {
        mBinding.ivBack.setOnClickListener(v -> finish());

        mBinding.ivClear.setOnClickListener(v -> {
            mBinding.etSearch.setText("");
        });

        mBinding.ivClearHistory.setOnClickListener(v -> {
            clearSearchHistory();
        });

        mBinding.etSearch.addTextChangedListener(mSearchTextWatcher);

        mBinding.tvSearchBtn.setOnClickListener(v -> {
            String keyword = mBinding.etSearch.getText().toString().trim();
            if (!keyword.isEmpty()) {
                performSearch(keyword);
            }
        });
    }

    @Override
    protected void initData() {
        initSearchHistory();
        initHotSearch();
    }

    private void initHotSearch() {

    }

    private void initSearchHistory() {

    }

    private void performSearch(String keyword) {
        if (!isChipExists(mBinding.chipGroupHistory, keyword)) {
            addChipToGroup(mBinding.chipGroupHistory, keyword, true);
        }
    }

    private boolean isChipExists(ChipGroup chipGroup, String text) {
        for (int i = 0; i < chipGroup.getChildCount(); i++) {
            View child = chipGroup.getChildAt(i);
            if (child instanceof Chip) {
                Chip chip = (Chip) child;
                if (text.equals(chip.getText().toString())) {
                    return true;
                }
            }
        }
        return false;
    }

    private void addChipToGroup(ChipGroup chipGroup, String text, boolean showCloseIcon) {
        Chip chip = createChip(text, showCloseIcon);

        if (showCloseIcon) {
            chip.setOnCloseIconClickListener(v -> {
                chipGroup.removeView(chip);
            });
        }

        chip.setOnClickListener(v -> {
            mBinding.etSearch.setText(text);
            mBinding.etSearch.setSelection(text.length());
            performSearch(text);
        });

        chipGroup.addView(chip);
    }

    private void clearSearchHistory() {
        mBinding.chipGroupHistory.removeAllViews();
    }

    private Chip createChip(String text, boolean showCloseIcon) {
        Chip chip = new Chip(this);
        chip.setText(text);
        chip.setCloseIconVisible(showCloseIcon);
        chip.setClickable(true);
        chip.setFocusable(true);

        chip.setChipBackgroundColorResource(R.color.white);
        chip.setRippleColorResource(R.color.transparent);
        chip.setTextColor(getResources().getColor(R.color.tv_common, null));
        chip.setTextSize(14);

        return chip;
    }

    private class SearchTextWatcher implements TextWatcher {
        @Override
        public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

        }

        @Override
        public void onTextChanged(CharSequence s, int i, int i1, int i2) {
            if (s.length() > 0) {
                mBinding.ivClear.setVisibility(View.VISIBLE);
            } else {
                mBinding.ivClear.setVisibility(View.GONE);
            }
        }

        @Override
        public void afterTextChanged(Editable editable) {

        }
    }
}