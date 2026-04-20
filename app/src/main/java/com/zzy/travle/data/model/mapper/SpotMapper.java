package com.zzy.travle.data.model.mapper;

import android.util.Log;

import com.zzy.travle.data.model.dos.RecommendationItemDO;
import com.zzy.travle.data.model.dos.ScenicSpotDo;
import com.zzy.travle.data.model.vo.RecommendationItemVO;
import com.zzy.travle.data.model.vo.ScenicSpotVO;

import java.util.ArrayList;
import java.util.List;

public class SpotMapper {

    public static final String TAG = "HomeMapper";

    public RecommendationItemVO mapRecommendationDOToVO(RecommendationItemDO recommendationDO) {
        if (recommendationDO == null) {
            Log.d(TAG, "[x] mapRecommendationDOToVO #44");
            return null;
        }

        return new RecommendationItemVO(
                recommendationDO.getId(),
                recommendationDO.getTitle(),
                recommendationDO.getCoverImage(),
                recommendationDO.getDescription(),
                recommendationDO.getRating(),
                recommendationDO.getLocation()
        );
    }

    public List<RecommendationItemVO> mapRecommendationListDOToVO(List<RecommendationItemDO> recommendationDOList) {
        if (recommendationDOList == null) {
            Log.d(TAG, "[x] mapRecommendationListDOToVO #62");
            return new ArrayList<>();
        }

        List<RecommendationItemVO> voList = new ArrayList<>();
        for (RecommendationItemDO recommendationDO : recommendationDOList) {
            voList.add(mapRecommendationDOToVO(recommendationDO));
        }
        return voList;
    }

    public ScenicSpotVO mapScenicSpotDOToVO(ScenicSpotDo scenicSpotDo) {
        if (scenicSpotDo == null) {
            Log.d(TAG, "[x] mapScenicSpotDOToVO #44");




            return null;
        }

        return new ScenicSpotVO(
                scenicSpotDo.getId(),
                scenicSpotDo.getName(),
                scenicSpotDo.getCoverImage(),
                scenicSpotDo.getRating(),
                scenicSpotDo.getReviewCount(),
                scenicSpotDo.getLocation(),
                scenicSpotDo.getPrice(),
                scenicSpotDo.getOriginalPrice(),
                scenicSpotDo.getPriceDesc(),
                scenicSpotDo.getDistance(),
                scenicSpotDo.getTag()
        );
    }

    public List<ScenicSpotVO> mapScenicSpotListDOToVO(List<ScenicSpotDo> scenicSpotDoList) {
        if (scenicSpotDoList == null) {
            Log.d(TAG, "[x] mapScenicSpotListDOToVO #37");
            return new ArrayList<>();
        }

        List<ScenicSpotVO> voList = new ArrayList<>();
        for (ScenicSpotDo scenicSpotDo : scenicSpotDoList) {
            voList.add(mapScenicSpotDOToVO(scenicSpotDo));
        }
        return voList;
    }
}
