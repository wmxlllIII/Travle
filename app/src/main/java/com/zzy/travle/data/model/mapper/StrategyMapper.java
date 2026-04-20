package com.zzy.travle.data.model.mapper;

import com.zzy.travle.data.model.dos.StrategyDo;
import com.zzy.travle.data.model.vo.StrategyVO;

import java.util.ArrayList;
import java.util.List;

public class StrategyMapper {
    public List<StrategyVO> mapList(List<StrategyDo> list) {
        List<StrategyVO> result = new ArrayList<>();

        for (StrategyDo dto : list) {
            StrategyVO vo = new StrategyVO();

            vo.setId(dto.getId());
            vo.setTitle(dto.getTitle());
            vo.setSummary(dto.getSummary());

            vo.setUserName(dto.getUserName());
            vo.setUserAvatar(dto.getUserAvatar());

            vo.setImageUrls(dto.getImages());
            vo.setTags(dto.getTags());

            vo.setPublishTime(dto.getPublishTime());

            vo.setLikeCount(dto.getLikeCount());
            vo.setCommentCount(dto.getCommentCount());
            vo.setCollectCount(dto.getCollectCount());

            result.add(vo);
        }

        return result;
    }
}
