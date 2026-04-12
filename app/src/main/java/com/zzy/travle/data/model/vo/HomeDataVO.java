package com.zzy.travle.data.model.vo;

import com.zzy.travle.data.model.dos.WeatherInfoDO;

import java.util.List;

public class HomeDataVO {
    private List<RecommendationItemVO> recommendations;

    public HomeDataVO(List<RecommendationItemVO> recommendations) {
        this.recommendations = recommendations;
    }

    public List<RecommendationItemVO> getRecommendations() {
        return recommendations;
    }

}
