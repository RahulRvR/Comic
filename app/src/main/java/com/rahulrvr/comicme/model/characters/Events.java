package com.rahulrvr.comicme.model.characters;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 rVr
 */
public class Events {

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
