package com.rahulrvr.comicme.model;

import com.google.gson.annotations.Expose;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 Elsevier
 */

public class Item__ {

    @Expose
    private String resourceURI;
    @Expose
    private String name;
    @Expose
    private String type;

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

}
