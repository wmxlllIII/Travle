package com.zzy.travle.data.repository.interfaces;

import com.zzy.travle.data.model.vo.CommentVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.data.model.vo.TravelGuideVO;
import com.zzy.travle.data.remote.common.Result;

import java.util.List;

public interface ScenicSpotRepository {
    // 获取所有景点列表
    Result<List<ScenicSpotVO>> getAllScenicSpots();

    // 获取单个景点的详细信息
    Result<ScenicSpotVO> getScenicSpotById(long spotId);

    // 根据关键词搜索景点
    Result<List<ScenicSpotVO>> searchScenicSpots(String query);

    // 获取景点的旅游攻略
    Result<List<TravelGuideVO>> getTravelGuideForSpot(long spotId);

    // 获取景点的评论
    Result<List<CommentVO>> getCommentsForSpot(long spotId);
}
