package com.guiying.module.news.service;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.guiying.module.common.base.BaseApplication;
import com.guiying.module.news.data.bean.OtherBean;
import com.guiying.module.news.data.bean.TestBean;
import com.guiying.module.news.service.NewService;

/**
 * Created by mac on 2018/4/20.
 */
@Route(path = "/a/b")
public class NewUtils implements NewService{
    public  void getNews(){
        OtherBean otherBean = new OtherBean("小欸","");
        Log.i("LDY",new TestBean("小小牛==>"+otherBean.name,"nan").toString());
        Toast.makeText(BaseApplication.getIns().getApplicationContext(), "我来了",Toast.LENGTH_LONG).show();
    }

    public  void getApp(){
        OtherBean otherBean = new OtherBean("小欸1","");
        Log.i("LDY",new TestBean("小0牛2==>"+otherBean.name,"nan").toString());
        Toast.makeText(BaseApplication.getIns().getApplicationContext(), "我来了11111",Toast.LENGTH_LONG).show();
    }

    @Override
    public void init(Context context) {

    }
}
