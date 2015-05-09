package com.rahulrvr.comicme.retrofit;

import com.rahulrvr.comicme.model.Comic;

import retrofit.http.GET;
import rx.Observable;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 Elsevier
 */
public interface CharacterService {

    @GET("/v1/public/characters?ts=1&apikey=eb95459cac0b6177473decbeb608a839&hash=1ae5d2e78ffa4682eb728f01a6c0c4f5")
    Observable<Comic> listCharacters();


}
