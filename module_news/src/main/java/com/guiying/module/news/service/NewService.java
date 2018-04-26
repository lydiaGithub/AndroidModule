package com.guiying.module.news.service;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by mac on 2018/4/24.
 */
public interface NewService extends IProvider{
    public  void getNews();
}
