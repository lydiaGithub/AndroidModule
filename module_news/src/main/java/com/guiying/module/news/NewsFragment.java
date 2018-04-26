package com.guiying.module.news;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.guiying.module.common.base.BaseFragment;
import com.guiying.module.news.service.NewService;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = "/news/NewsFragment")
public class NewsFragment extends BaseFragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment NewsFragment.
     */
    public static NewsFragment newInstance() {
        return new NewsFragment();
    }



    public NewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //ARouter.getInstance().build("/girls/list").navigation();
        return inflater.inflate(R.layout.fragment_news, container, false);
    }


}
