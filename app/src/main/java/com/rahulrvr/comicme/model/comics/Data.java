package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class Data {

    @Expose
    private Integer offset;
    @Expose
    private Integer limit;
    @Expose
    private Integer total;
    @Expose
    private Integer count;
    @Expose
    @SerializedName("results")
    private List<Comic> comics = new ArrayList<Comic>();

    /**
     *
     * @return
     * The offset
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     *
     * @param offset
     * The offset
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    /**
     *
     * @return
     * The limit
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     *
     * @param limit
     * The limit
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     *
     * @return
     * The total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     *
     * @param total
     * The total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     *
     * @return
     * The count
     */
    public Integer getCount() {
        return count;
    }

    /**
     *
     * @param count
     * The count
     */
    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     *
     * @return
     * The comics
     */
    public List<Comic> getComics() {
        return comics;
    }

    /**
     *
     * @param comics
     * The comics
     */
    public void setComics(List<Comic> comics) {
        this.comics = comics;
    }

}
