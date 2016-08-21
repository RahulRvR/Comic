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

    @GET("/v1/public/characters?ts=1&apikey=eb95459cac0b6177473decbeb608a839&hash=1ae5d2e78ffa4682eb728f01a6c0c4f5&limit=50&offset=50")
    Observable<CharacterResponse> listCharacters();


    @GET("/v1/public/characters/{characterId}?ts=1&apikey=eb95459cac0b6177473decbeb608a839&hash=1ae5d2e78ffa4682eb728f01a6c0c4f5")
    Observable<Comic> getCharacter(@Path("characterId") int comicId);

}
