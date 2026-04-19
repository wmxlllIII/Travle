package com.zzy.travle.ui.adapter.diff;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.zzy.travle.data.model.vo.StrategyVO;

public class StrategyDiffCallback extends DiffUtil.ItemCallback<StrategyVO> {

    @Override
    public boolean areItemsTheSame(@NonNull StrategyVO oldItem, @NonNull StrategyVO newItem) {
        return false;
    }

    @Override
    public boolean areContentsTheSame(@NonNull StrategyVO oldItem, @NonNull StrategyVO newItem) {
        return false;
    }
}
