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
import com.rahulrvr.comicme.adapters.CharacterListAdapter;
import com.rahulrvr.comicme.retrofit.CharacterService;

import butterknife.ButterKnife;
import butterknife.InjectView;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class HomeFragment extends BaseFragment {

    @InjectView(R.id.characterList)
    RecyclerView characterList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container, false);
        ButterKnife.inject(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        characterList.setLayoutManager(layoutManager);

    }

    @Override
    public void onResume() {
        super.onResume();
        CharacterService service = MyApplication.getInstance().getRestAdapter().create(CharacterService.class);
        service.listCharacters().observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            characterList.setAdapter(new CharacterListAdapter(getActivity(), comic.getData().getCharacters()));
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.reset(this);
    }

}
