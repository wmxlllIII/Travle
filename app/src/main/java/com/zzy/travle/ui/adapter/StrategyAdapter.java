package com.zzy.travle.ui.adapter;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.ui.adapter.diff.StrategyDiffCallback;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;
import com.zzy.travle.ui.adapter.viewholder.StrategyViewHolder;

public class StrategyAdapter extends ListAdapter<StrategyVO, StrategyViewHolder> {

    public StrategyAdapter(OnStrategyClickListener listener) {
        super(new StrategyDiffCallback());
    }

    @NonNull
    @Override
    public StrategyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull StrategyViewHolder holder, int position) {

    }
}
