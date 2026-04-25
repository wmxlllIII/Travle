package com.zzy.travle.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

import com.bumptech.glide.Glide;
import com.zzy.travle.databinding.ItemImagePickerBinding;
import com.zzy.travle.ui.adapter.diff.ImagePickerDiffCallback;
import com.zzy.travle.ui.adapter.interfaces.OnPickerClickListener;
import com.zzy.travle.ui.adapter.viewholder.ImagePickerViewHolder;

public class ImagePickerAdapter extends ListAdapter<String, ImagePickerViewHolder> {

    private ItemImagePickerBinding binding;
    private OnPickerClickListener mlistener;

    public ImagePickerAdapter(OnPickerClickListener listener) {
        super(new ImagePickerDiffCallback());
        mlistener = listener;
    }

    @NonNull
    @Override
    public ImagePickerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        binding = ItemImagePickerBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ImagePickerViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ImagePickerViewHolder holder, int position) {
        String imageUrl = getItem(position);
        // 加载图片
        Glide.with(holder.itemView.getContext())
                .load(imageUrl)
                .centerCrop()
                .into(binding.ivImage);

        // 删除按钮
        binding.ivDelete.setOnClickListener(v -> {
            mlistener.onRemove(position);
        });
    }
}
