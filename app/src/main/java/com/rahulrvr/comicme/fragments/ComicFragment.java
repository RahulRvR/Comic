package com.rahulrvr.comicme.fragments;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.MyApplication;
import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.activities.ComicDetailActivity;
import com.rahulrvr.comicme.adapters.ComicListAdapter;
import com.rahulrvr.comicme.databinding.ComicFragmentLayoutBinding;
import com.rahulrvr.comicme.model.comics.Comic;
import com.rahulrvr.comicme.retrofit.ComicService;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class ComicFragment extends BaseFragment implements ComicListAdapter.OnComicItemClickListener {

    List<Comic> mComicList;
    ComicFragmentLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.comic_fragment_layout,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.comicList.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
    }

    @Override
    public void onResume() {
        super.onResume();
        ComicService service = MyApplication.getInstance().getRestAdapter().create(ComicService.class);
        service.getComics().subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            mComicList = comic.getData().getComics();
            binding.comicList.setAdapter(new ComicListAdapter(getActivity(), mComicList, this));
        }, Throwable::printStackTrace);
    }

    @Override
    public void OnComicSelected(int position) {
        Comic comic = mComicList.get(position);
        Intent intent = ComicDetailActivity.newInstance(getActivity(), comic.getThumbnail(), comic.getTitle(), comic.getId(), true);
        getActivity().startActivity(intent);
    }
}
