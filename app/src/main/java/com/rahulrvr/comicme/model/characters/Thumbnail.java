package com.rahulrvr.comicme.model.characters;

import com.google.gson.annotations.Expose;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 Elsevier
 */
public class Thumbnail {

    @Expose
    private String path;
    @Expose
    private String extension;

    /**
     *
     * @return
     * The path
     */
    public String getPath() {
        return path;
    }

    /**
     *
     * @param path
     * The path
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     *
     * @return
     * The extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     *
     * @param extension
     * The extension
     */
    public void setExtension(String extension) {
        this.extension = extension;
    }

}
