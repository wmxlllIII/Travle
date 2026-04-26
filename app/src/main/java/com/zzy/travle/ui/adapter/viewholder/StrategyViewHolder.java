package com.zzy.travle.ui.adapter.viewholder;

import android.util.Log;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.databinding.ItemStrategyBinding;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;
import com.zzy.travle.util.TimeFormatter;

import java.util.Optional;

public class StrategyViewHolder extends RecyclerView.ViewHolder {
    private final ItemStrategyBinding mBinding;

    public StrategyViewHolder(ItemStrategyBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    public void bind(StrategyVO vo, OnStrategyClickListener mListener) {
        Log.d("wmx ", "bind: "+vo);
        mBinding.tvUsername.setText(vo.getUserName());
        mBinding.tvTime.setText(vo.getPublishTime());

        Glide.with(mBinding.ivAvatar.getContext())
                .load(vo.getUserAvatar())
                .transform(new RoundedCorners(12))
                .into(mBinding.ivAvatar);

        mBinding.tvTitle.setText(vo.getTitle());
        mBinding.tvSummary.setText(vo.getSummary());

        Glide.with(mBinding.ivCover)
                .load(vo.getCover())
                .into(mBinding.ivCover);

//        StringBuilder tagBuilder = new StringBuilder();
//        for (String tag : vo.getTags()) {
//            tagBuilder.append("#").append(tag).append(" ");
//        }
//        mBinding.tvTags.setText(tagBuilder.toString().trim());

        mBinding.tvLike.setText("❤️ " + vo.getLikeCount());
        mBinding.tvComment.setText("💬 " + vo.getCommentCount());
        mBinding.tvCollect.setText("⭐ " + vo.getCollectCount());

        mBinding.getRoot().setOnClickListener(v -> {
            if (mListener != null) {
                //todo
//                mListener.onClick(vo);
            }
        });
    }
}
