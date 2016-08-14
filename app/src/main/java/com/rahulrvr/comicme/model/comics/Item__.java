package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class Item__ {

    @Expose
    private String resourceURI;
    @Expose
    private String name;

    /**
     *
     * @return
     * The resourceURI
     */
    public String getResourceURI() {
        return resourceURI;
    }

    /**
     *
     * @param resourceURI
     * The resourceURI
     */
    public void setResourceURI(String resourceURI) {
        this.resourceURI = resourceURI;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

}
