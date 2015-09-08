package com.rahulrvr.comicme.fragments;

import android.content.Intent;
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
import com.rahulrvr.comicme.activities.ComicDetailActivity;
import com.rahulrvr.comicme.adapters.CharacterListAdapter;
import com.rahulrvr.comicme.adapters.ComicListAdapter;
import com.rahulrvr.comicme.model.characters.Character;
import com.rahulrvr.comicme.retrofit.CharacterService;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class CharacterFragment extends BaseFragment implements ComicListAdapter.OnComicItemClickListener{

    @Bind(R.id.characterList)
    RecyclerView characterList;
    List<Character> mCharacters;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment_layout, container, false);
        ButterKnife.bind(this, view);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        characterList.setLayoutManager(layoutManager);
        CharacterService service = MyApplication.getInstance().getRestAdapter().create(CharacterService.class);
        service.listCharacters().observeOn(AndroidSchedulers.mainThread()).subscribe(comic -> {
            Log.d("xx", "dsf");
            mCharacters = comic.getData().getCharacters();
            characterList.setAdapter(new CharacterListAdapter(getActivity(), mCharacters, this));
        });

    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    @Override
    public void OnComicSelected(int position) {
        Character character = mCharacters.get(position);
        Intent intent = new Intent(getActivity(),ComicDetailActivity.class);
        intent.putExtra("comic", character.getThumbnail());
        intent.putExtra("comicTitle", character.getName());
        getActivity().startActivity(intent);
    }
}
