package com.zzy.travle.data.repository;

import com.zzy.travle.data.model.vo.HotSpringVO;
import com.zzy.travle.data.remote.api.HotSpringApi;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.remote.network.NetworkHelper;
import com.zzy.travle.data.remote.network.RetrofitFactory;
import com.zzy.travle.data.repository.interfaces.HotSpringRepository;

import java.util.List;

public class HotSpringRepositoryImpl implements HotSpringRepository {


    public static final String TAG = "HotSpringRepository";
    private final HotSpringApi hotSpringApi = RetrofitFactory.get().create(HotSpringApi.class);

    @Override
    public Result<List<HotSpringVO>> getHotSpringList() {
        return NetworkHelper.executeCall(hotSpringApi::getHotSpringList);
    }

    @Override
    public Result<HotSpringVO> getHotSpringDetail(Long hotSpringId) {
        return NetworkHelper.executeCall(() -> hotSpringApi.getHotSpringDetail(hotSpringId));
    }

}
