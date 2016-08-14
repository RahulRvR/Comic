package com.rahulrvr.comicme.model.characters;

import com.google.gson.annotations.Expose;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 rVr
 */
public class Url {

    @Expose
    private String type;
    @Expose
    private String url;

    /**
     *
     * @return
     * The type
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     * The type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

}
