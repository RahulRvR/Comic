package com.rahulrvr.comicme.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.MyApplication;
import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.activities.ComicDetailActivity;
import com.rahulrvr.comicme.adapters.ComicListAdapter;
import com.rahulrvr.comicme.model.comics.Comic;
import com.rahulrvr.comicme.retrofit.ComicService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

import rx.android.schedulers.AndroidSchedulers;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class ComicFragment extends BaseFragment implements ComicListAdapter.OnComicItemClickListener{

    @Bind(R.id.comicList)
    RecyclerView comicList;
    List<Comic> mComicList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.comic_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        comicList.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
    }

    @Override
    public void onResume() {
        super.onResume();
        ComicService service = MyApplication.getInstance().getRestAdapter().create(ComicService.class);
        service.getComics().observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            mComicList = comic.getData().getComics();
            comicList.setAdapter(new ComicListAdapter(getActivity(), mComicList,this));
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }

    @Override
    public void OnComicSelected(int position) {
        Comic comic = mComicList.get(position);
        Intent intent = new Intent(getActivity(),ComicDetailActivity.class);
        intent.putExtra("comic", comic.getThumbnail());
        intent.putExtra("comicTitle", comic.getTitle());
        intent.putExtra("id", comic.getId());
        getActivity().startActivity(intent);
    }
}
