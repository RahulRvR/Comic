package com.rahulrvr.comicme.retrofit;

import com.rahulrvr.comicme.model.characters.CharacterResponse;
import com.rahulrvr.comicme.model.stories.Comic;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 rVr
 */
public interface CharacterService {

    @GET("/v1/public/characters?limit=50&offset=100")
    Observable<CharacterResponse> listCharacters();


    @GET("/v1/public/characters/{characterId}")
    Observable<Comic> getCharacter(@Path("characterId") int comicId);

}
