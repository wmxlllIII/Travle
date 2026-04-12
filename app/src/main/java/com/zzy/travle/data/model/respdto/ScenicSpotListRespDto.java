package com.zzy.travle.data.model.respdto;

import com.zzy.travle.data.model.dos.ScenicSpotDo;

import java.util.List;

public class ScenicSpotListRespDto {
    private List<ScenicSpotDo> spots;

    public List<ScenicSpotDo> getSpots() {
        return spots;
    }

    public void setSpots(List<ScenicSpotDo> spots) {
        this.spots = spots;
    }

    @Override
    public String toString() {
        return "ScenicSpotListRespDto{" +
                "spots=" + spots +
                '}';
    }
}
