package com.rahulrvr.comicme.retrofit;

import com.rahulrvr.comicme.model.characters.CharacterResponse;
import com.rahulrvr.comicme.model.comics.ComicResponse;
import com.rahulrvr.comicme.model.stories.Comic;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public interface MarvelApiService {

    @GET("/v1/public/comics?limit=50&offset=50")
    Observable<ComicResponse> getComics();


//    @GET("/v1/public/comics/{comicId}/stories?ts=1&apikey=eb95459cac0b6177473decbeb608a839&hash=1ae5d2e78ffa4682eb728f01a6c0c4f5")
//    Observable<Characters> getComicStory(@Path("comicId") int comicId);

    @GET("/v1/public/comics/{comicId}")
    Observable<Comic> getComic(@Path("comicId") int comicId);

    @GET("/v1/public/characters/{characterId}")
    Observable<Comic> getCharacter(@Path("characterId") int comicId);

    @GET("/v1/public/characters?limit=50&offset=100")
    Observable<CharacterResponse> listCharacters();

}

