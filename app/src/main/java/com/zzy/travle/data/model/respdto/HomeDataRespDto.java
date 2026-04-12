package com.zzy.travle.data.model.respdto;

import com.zzy.travle.data.model.dos.RecommendationItemDO;

import java.util.List;

public class HomeDataRespDto {
    private List<RecommendationItemDO> recommendations;

    public List<RecommendationItemDO> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<RecommendationItemDO> recommendations) {
        this.recommendations = recommendations;
    }

    @Override
    public String toString() {
        return "HomeDataRespDto{" +
                ", recommendations=" + recommendations +
                '}';
    }
}
