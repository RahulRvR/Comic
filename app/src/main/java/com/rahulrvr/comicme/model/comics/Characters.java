package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class Characters {

    @Expose
    private Integer available;
    @Expose
    private String collectionURI;
    @Expose
    private List<Object> items = new ArrayList<Object>();
    @Expose
    private Integer returned;

    /**
     *
     * @return
     * The available
     */
    public Integer getAvailable() {
        return available;
    }

    /**
     *
     * @param available
     * The available
     */
    public void setAvailable(Integer available) {
        this.available = available;
    }

    /**
     *
     * @return
     * The collectionURI
     */
    public String getCollectionURI() {
        return collectionURI;
    }

    /**
     *
     * @param collectionURI
     * The collectionURI
     */
    public void setCollectionURI(String collectionURI) {
        this.collectionURI = collectionURI;
    }

    /**
     *
     * @return
     * The items
     */
    public List<Object> getItems() {
        return items;
    }

    /**
     *
     * @param items
     * The items
     */
    public void setItems(List<Object> items) {
        this.items = items;
    }

    /**
     *
     * @return
     * The returned
     */
    public Integer getReturned() {
        return returned;
    }

    /**
     *
     * @param returned
     * The returned
     */
    public void setReturned(Integer returned) {
        this.returned = returned;
    }

}