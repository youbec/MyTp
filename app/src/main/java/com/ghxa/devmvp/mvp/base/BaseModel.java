package com.ghxa.devmvp.mvp.base;

import com.ghxa.devmvp.api.DevMvpApi;
import com.ghxa.devmvp.api.DevMvpService;

import io.reactivex.disposables.CompositeDisposable;



public abstract class BaseModel {


    public CompositeDisposable mDisposable = new CompositeDisposable();

    /**
     * 初始化调用网络请求
     * @return
     */
    public DevMvpService apiService() {
        return DevMvpApi.createApi().create(DevMvpService.class);
    }
    /**
     * 取消网络请求
     */
    public void onDestroy() {

        if (mDisposable != null) {
            mDisposable.dispose();
            mDisposable.clear();
        }
    }
}
