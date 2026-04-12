package com.zzy.travle.ui.adapter.viewholder;

import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.zzy.travle.R;
import com.zzy.travle.data.constant.Constants;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.databinding.ItemScenicSpotBinding;
import com.zzy.travle.ui.adapter.interfaces.OnScenicSpotClickListener;

public class ScenicSpotViewHolder extends RecyclerView.ViewHolder {
    private final ItemScenicSpotBinding binding;

    public ScenicSpotViewHolder(ItemScenicSpotBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public void bind(ScenicSpotVO spotVO, OnScenicSpotClickListener listener) {
        Glide.with(binding.ivScenicImage.getContext())
                .load(spotVO.getCoverImage())
                .placeholder(R.color.home_bg_gradient_start)
                .transform(new RoundedCorners(12))
                .into(binding.ivScenicImage);

        binding.tvScenicName.setText(spotVO.getName());

        binding.ratingBar.setRating((float) spotVO.getRating());
        binding.tvRating.setText(String.valueOf(spotVO.getRating()));

        binding.tvReviewCount.setText(formatReviewCount(spotVO.getReviewCount()));

        binding.tvLocation.setText(spotVO.getLocation());

        boolean isFree = (int) spotVO.getPrice() == 0;

        if (isFree) {
            binding.tvPrice.setText("免费");
        } else {
            binding.tvPrice.setText("¥" + (int) spotVO.getPrice());
        }
        binding.tvBookBtn.setVisibility(isFree ? View.GONE : View.VISIBLE);


        if (spotVO.getOriginalPrice() > 0 && spotVO.getOriginalPrice() != spotVO.getPrice()) {
            binding.tvOriginalPrice.setText("¥" + (int) spotVO.getOriginalPrice());
            binding.tvOriginalPrice.setVisibility(View.VISIBLE);
        } else {
            binding.tvOriginalPrice.setVisibility(View.GONE);
        }

        binding.tvPriceDesc.setText(spotVO.getPriceDesc() != null ? spotVO.getPriceDesc() : "成人票");

        if (spotVO.getDistance() != null && !spotVO.getDistance().isEmpty()) {
            binding.tvDistance.setText(spotVO.getDistance());
            binding.tvDistance.setVisibility(View.VISIBLE);
        } else {
            binding.tvDistance.setVisibility(View.GONE);
        }

        if (spotVO.getTag() != null && !spotVO.getTag().isEmpty()) {
            binding.tvTag.setText(spotVO.getTag());
            binding.tvTag.setVisibility(View.VISIBLE);
        } else {
            binding.tvTag.setVisibility(View.GONE);
        }

        binding.getRoot().setOnClickListener(v -> {
            if (listener != null) {
                listener.onScenicSpotClick((int) spotVO.getId());
            }
        });

        binding.tvBookBtn.setOnClickListener(v -> {
            if (listener != null) {
                listener.onScenicSpotBookClick((int) spotVO.getId());
            }
        });
    }

    private String formatReviewCount(int count) {
        if (count >= 10000) {
            return String.format("%.1f万条评价", count / 10000.0);
        } else if (count >= 1000) {
            return String.format("%.1fk条评价", count / 1000.0);
        } else {
            return count + "条评价";
        }
    }
}
