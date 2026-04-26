package com.zzy.travle.data.model.mapper;

import com.zzy.travle.data.model.dos.StrategyDo;
import com.zzy.travle.data.model.vo.StrategyVO;
import com.zzy.travle.util.TimeFormatter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

            Optional.ofNullable(dto.getImageUrls())
                    .filter(imageList -> !imageList.isEmpty())
                    .ifPresent(imageList -> {
                        vo.setCover(imageList.get(0));
                        vo.setImageUrls(imageList);
                    });
            vo.setTags(dto.getTags());

            vo.setPublishTime(TimeFormatter.formatRelativeTimeText(dto.getPublishTime()));

            vo.setLikeCount(dto.getLikeCount());
            vo.setCommentCount(dto.getCommentCount());
            vo.setCollectCount(dto.getCollectCount());

            result.add(vo);
        }

        return result;
    }
}
