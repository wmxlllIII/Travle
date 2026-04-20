package com.zzy.travle.ui.adapter.viewholder;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.databinding.ItemStrategyBinding;
import com.zzy.travle.ui.adapter.interfaces.OnStrategyClickListener;

public class StrategyViewHolder extends RecyclerView.ViewHolder {
    private ItemStrategyBinding mBinding;

    public StrategyViewHolder(ItemStrategyBinding binding) {
        super(binding.getRoot());
        this.mBinding = binding;
    }

    public void bind(StrategyVO vo, OnStrategyClickListener mListener) {
        mBinding.tvUsername.setText(vo.getUserName());
        mBinding.tvTime.setText(vo.getPublishTime());

        Glide.with(mBinding.ivAvatar.getContext())
                .load(vo.getUserAvatar())
                .into(mBinding.ivAvatar);

        mBinding.tvTitle.setText(vo.getTitle());
        mBinding.tvSummary.setText(vo.getSummary());

        Glide.with(mBinding.ivCover.getContext())
                .load(vo.getImageUrls().get(0))
                .into(mBinding.ivCover);

        StringBuilder tagBuilder = new StringBuilder();
        for (String tag : vo.getTags()) {
            tagBuilder.append("#").append(tag).append(" ");
        }
        mBinding.tvTags.setText(tagBuilder.toString().trim());

        mBinding.tvLike.setText("❤️ " + vo.getLikeCount());
        mBinding.tvComment.setText("💬 " + vo.getCommentCount());
        mBinding.tvCollect.setText("⭐ " + vo.getCollectCount());

        // ===== 点击 =====
        mBinding.getRoot().setOnClickListener(v -> {
            if (mListener != null) {
                //todo
//                mListener.onClick(vo);
            }
        });
    }
}
