package com.rahulrvr.comicme.retrofit;

import com.rahulrvr.comicme.model.comics.ComicResponse;

import retrofit.http.GET;
import rx.Observable;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public interface ComicService {

    @GET("/v1/public/comics?ts=1&apikey=eb95459cac0b6177473decbeb608a839&hash=1ae5d2e78ffa4682eb728f01a6c0c4f5")
    Observable<ComicResponse> getComics();
}

