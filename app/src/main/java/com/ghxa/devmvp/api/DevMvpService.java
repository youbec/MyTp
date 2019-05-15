package com.ghxa.devmvp.api;

import com.ghxa.devmvp.mvp.bean.BookBean;

import io.reactivex.Observable;
import retrofit2.http.GET;


public interface DevMvpService {


    @GET(Url.BOOK_CLASSIFY)
    Observable<BookBean> bookClassify();

}
