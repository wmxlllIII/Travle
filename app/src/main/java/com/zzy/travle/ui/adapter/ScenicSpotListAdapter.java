package com.zzy.travle.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.databinding.ItemScenicSpotBinding;
import com.zzy.travle.ui.adapter.diff.ScenicSpotDiffCallback;
import com.zzy.travle.ui.adapter.interfaces.OnScenicSpotClickListener;
import com.zzy.travle.ui.adapter.viewholder.ScenicSpotViewHolder;

public class ScenicSpotListAdapter extends ListAdapter<ScenicSpotVO, ScenicSpotViewHolder> {

    private final OnScenicSpotClickListener mListener;

    public ScenicSpotListAdapter(OnScenicSpotClickListener listener) {
        super(new ScenicSpotDiffCallback());
        this.mListener = listener;
    }

    @NonNull
    @Override
    public ScenicSpotViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemScenicSpotBinding binding = ItemScenicSpotBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);

        return new ScenicSpotViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ScenicSpotViewHolder holder, int position) {
        ScenicSpotVO spotVO = getItem(position);
        holder.bind(spotVO, mListener);
    }
}
