package com.ghxa.devmvp.mvp.view.fragment;

import android.os.Bundle;

import com.ghxa.cui.devmvp.R;
import com.ghxa.devmvp.mvp.base.BaseFragment;
import com.ghxa.devmvp.mvp.contract.CMusic;
import com.ghxa.devmvp.mvp.presenter.PMusicImpl;


public class MusicFragment extends BaseFragment<PMusicImpl> implements CMusic.IVMusic {


    public static MusicFragment newInstance() {
        MusicFragment fragment = new MusicFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    protected void initView() {


    }

    @Override
    public int getLayoutRes() {
        return R.layout.fragment_music;
    }

    @Override
    public void createPresenter() {
        mPresenter = new PMusicImpl(mContext, this);
    }

    @Override
    public void showLoading() {
    }

    @Override
    public void hideLoading() {
    }

}
