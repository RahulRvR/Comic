package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class Date {

    @Expose
    private String type;
    @Expose
    private String date;

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
     * The date
     */
    public String getDate() {
        return date;
    }

    /**
     *
     * @param date
     * The date
     */
    public void setDate(String date) {
        this.date = date;
    }

}
