package com.guiying.module.girls;


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
@Route(path = "/girls/GirlsFragment")

public class GirlsFragment extends BaseFragment {

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment GirlsFragment.
     */
    public static GirlsFragment newInstance() {
        return new GirlsFragment();
    }


    public GirlsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // NewUtils.getNews("");
        ARouter.getInstance().navigation(NewService.class).getNews();
        //ARouter.getInstance().navigation(NewService.class).getNews();
        return inflater.inflate(R.layout.fragment_girls, container, false);
    }


}
