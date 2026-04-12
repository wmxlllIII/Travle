package com.zzy.travle.ui.adapter.diff;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.zzy.travle.data.model.vo.ScenicSpotVO;

public class ScenicSpotDiffCallback extends DiffUtil.ItemCallback<ScenicSpotVO> {
    @Override
    public boolean areItemsTheSame(@NonNull ScenicSpotVO oldItem, @NonNull ScenicSpotVO newItem) {
        return oldItem.getId() == newItem.getId();
    }
    @Override
    public boolean areContentsTheSame(@NonNull ScenicSpotVO oldItem, @NonNull ScenicSpotVO newItem) {
        return oldItem.getId() == newItem.getId() &&
                oldItem.getName().equals(newItem.getName()) &&
                oldItem.getRating() == newItem.getRating() &&
                oldItem.getPrice() == newItem.getPrice();
    }
}
