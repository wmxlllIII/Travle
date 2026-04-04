package com.zzy.travle.data.repository;

import com.zzy.travle.data.model.vo.CommentVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;
import com.zzy.travle.data.model.vo.TravelGuideVO;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.repository.interfaces.ScenicSpotRepository;

import java.util.List;

public class ScenicSpotRepositoryImpl implements ScenicSpotRepository {
    @Override
    public Result<List<ScenicSpotVO>> getAllScenicSpots() {
        return null;
    }

    @Override
    public Result<ScenicSpotVO> getScenicSpotById(long spotId) {
        return null;
    }

    @Override
    public Result<List<ScenicSpotVO>> searchScenicSpots(String query) {
        return null;
    }

    @Override
    public Result<List<TravelGuideVO>> getTravelGuideForSpot(long spotId) {
        return null;
    }

    @Override
    public Result<List<CommentVO>> getCommentsForSpot(long spotId) {
        return null;
    }
}
