package com.rahulrvr.comicme.fragments;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.MyApplication;
import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.activities.ComicDetailActivity;
import com.rahulrvr.comicme.adapters.CharacterListAdapter;
import com.rahulrvr.comicme.adapters.ComicListAdapter;
import com.rahulrvr.comicme.databinding.HomeFragmentLayoutBinding;
import com.rahulrvr.comicme.model.characters.Character;
import com.rahulrvr.comicme.retrofit.MarvelApiService;

import java.util.List;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class CharacterFragment extends BaseFragment implements ComicListAdapter.OnComicItemClickListener{

    List<Character> mCharacters;
    HomeFragmentLayoutBinding binding;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.home_fragment_layout,container,false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        binding.characterList.setLayoutManager(layoutManager);
        MarvelApiService service = MyApplication.getInstance().getRestAdapter().create(MarvelApiService.class);
        service.listCharacters().subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Timber.d("Fetched Comic");
            mCharacters = comic.getData().getCharacters();
            binding.characterList.setAdapter(new CharacterListAdapter(getActivity(), mCharacters, this));
        });

    }

    @Override
    public void OnComicSelected(int position) {
        Character character = mCharacters.get(position);
        Intent intent = ComicDetailActivity.newInstance(getActivity(), character.getThumbnail(), character.getName(), character.getId(), false);
        getActivity().startActivity(intent);
    }
}
