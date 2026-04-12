package com.zzy.travle.data.manager;

public interface DataCallback<T> {
    void onSuccess(T data);
    void onError(String error);
}
