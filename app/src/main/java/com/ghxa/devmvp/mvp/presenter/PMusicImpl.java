package com.ghxa.devmvp.mvp.presenter;

import android.content.Context;

import com.ghxa.devmvp.mvp.base.BasePresenter;
import com.ghxa.devmvp.mvp.contract.CMusic;
import com.ghxa.devmvp.mvp.model.MMusicImpl;



public class PMusicImpl extends BasePresenter<CMusic.IVMusic, MMusicImpl> implements CMusic.IPMusic {


    public PMusicImpl(Context mContext, CMusic.IVMusic mView) {
        super(mContext, mView, new MMusicImpl());
    }

}
