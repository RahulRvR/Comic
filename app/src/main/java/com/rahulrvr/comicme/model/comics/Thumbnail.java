package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
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
