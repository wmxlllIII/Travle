package com.zzy.travle.data.model.respdto;

import com.zzy.travle.data.model.dos.StrategyDo;

import java.util.List;

public class StrategyListRespDto {
    private List<StrategyDo> list;

    public List<StrategyDo> getList() {
        return list;
    }

    public void setList(List<StrategyDo> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "StrategyListRespDto{" +
                "list=" + list +
                '}';
    }
}
