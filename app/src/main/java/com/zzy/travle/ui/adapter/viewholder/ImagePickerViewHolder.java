package com.zzy.travle.ui.adapter.viewholder;

import androidx.recyclerview.widget.RecyclerView;

import com.zzy.travle.databinding.ItemImagePickerBinding;

public class ImagePickerViewHolder extends RecyclerView.ViewHolder {

    private final ItemImagePickerBinding mBinding;

    public ImagePickerViewHolder(ItemImagePickerBinding binding) {
        super(binding.getRoot());
        mBinding = binding;
    }

    public void bind(String imagePath) {

    }
}
