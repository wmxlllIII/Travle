package com.zzy.travle.data.repository.interfaces;

import com.zzy.travle.data.model.vo.HotSpringVO;
import com.zzy.travle.data.remote.common.Result;

import java.util.List;

public interface HotSpringRepository {

    Result<List<HotSpringVO>> getHotSpringList();

    Result<HotSpringVO> getHotSpringDetail(Long hotSpringId);

}
