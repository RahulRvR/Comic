package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class TextObject {

    @Expose
    private String type;
    @Expose
    private String language;
    @Expose
    private String text;

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
     * The language
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param language
     * The language
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

}
