package com.zzy.travle.ui.adapter.diff;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class ImagePickerDiffCallback extends DiffUtil.ItemCallback<String> {
    @Override
    public boolean areItemsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem.equals(newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull String oldItem, @NonNull String newItem) {
        return oldItem.equals(newItem);
    }
}
