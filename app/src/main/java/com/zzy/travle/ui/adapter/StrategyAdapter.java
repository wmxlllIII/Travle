package com.zzy.travle.ui.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.databinding.ItemStrategyBinding;
import com.zzy.travle.ui.adapter.diff.StrategyDiffCallback;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;
import com.zzy.travle.ui.adapter.viewholder.StrategyViewHolder;

public class StrategyAdapter extends ListAdapter<StrategyVO, StrategyViewHolder> {
    private final OnStrategyClickListener mListener;

    public StrategyAdapter(OnStrategyClickListener listener) {
        super(new StrategyDiffCallback());
        this.mListener = listener;
    }

    @NonNull
    @Override
    public StrategyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemStrategyBinding binding = ItemStrategyBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new StrategyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull StrategyViewHolder holder, int position) {
        StrategyVO strategyVO = getItem(position);
        holder.bind(strategyVO,mListener);
    }
}
