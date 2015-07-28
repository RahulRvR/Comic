package com.rahulrvr.comicme.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.MyApplication;
import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.adapters.ComicListAdapter;
import com.rahulrvr.comicme.retrofit.ComicService;

import butterknife.ButterKnife;
import butterknife.InjectView;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class ComicFragment extends BaseFragment {

    @InjectView(R.id.comicList)
    RecyclerView comicList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.comic_fragment_layout, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        comicList.setLayoutManager(layoutManager);
    }

    @Override
    public void onResume() {
        super.onResume();
        ComicService service = MyApplication.getInstance().getRestAdapter().create(ComicService.class);
        service.getComics().observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            comicList.setAdapter(new ComicListAdapter(getActivity(), comic.getData().getComics()));
        });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }
}
