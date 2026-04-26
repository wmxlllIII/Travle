package com.zzy.travle.data.manager;

import android.os.Handler;
import android.os.Looper;

import com.zzy.travle.data.model.vo.HotSpringVO;
import com.zzy.travle.data.remote.common.Result;
import com.zzy.travle.data.repository.HotSpringRepositoryImpl;
import com.zzy.travle.data.repository.interfaces.HotSpringRepository;
import com.zzy.travle.util.ThreadPoolProvider;

import java.util.List;

public class HotSpringManager {

    public static final String TAG = "HotSpringManager";
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final HotSpringRepository hotSpringRepository = new HotSpringRepositoryImpl();

    public void loadHotSpringList(DataCallback<List<HotSpringVO>> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<List<HotSpringVO>> result = hotSpringRepository.getHotSpringList();

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

    public void getSpringDetail(Long hotSpringId, DataCallback<HotSpringVO> callback) {
        ThreadPoolProvider.getInstance().execute(() -> {
            Result<HotSpringVO> result = hotSpringRepository.getHotSpringDetail(hotSpringId);

            mHandler.post(() -> {
                if (result.isSuccess()) {
                    callback.onSuccess(result.getData());
                } else {
                    callback.onError(result.getError());
                }
            });
        });
    }

}
