package com.ghxa.devmvp.mvp.base;



public interface IDevMvpCallBack<T> {

    void onSuccess(T t);

    void onFail(String reason);
}
