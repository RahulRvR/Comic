package com.rahulrvr.comicme.model;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vijayr on 3/28/15.
 * Copyright (C) 2014 Elsevier
 */
public class Character {

    @Expose
    private Integer id;
    @Expose
    private String name;
    @Expose
    private String description;
    @Expose
    private String modified;
    @Expose
    private Thumbnail thumbnail;
    @Expose
    private String resourceURI;
    @Expose
    private Comics comics;
    @Expose
    private Series series;
    @Expose
    private Stories stories;
    @Expose
    private Events events;
    @Expose
    private List<Url> urls = new ArrayList<Url>();

    /**
     *
     * @return
     * The id
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * The description
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     * The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     * The modified
     */
    public String getModified() {
        return modified;
    }

    /**
     *
     * @param modified
     * The modified
     */
    public void setModified(String modified) {
        this.modified = modified;
    }

    /**
     *
     * @return
     * The thumbnail
     */
    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     *
     * @param thumbnail
     * The thumbnail
     */
    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

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
     * The comics
     */
    public Comics getComics() {
        return comics;
    }

    /**
     *
     * @param comics
     * The comics
     */
    public void setComics(Comics comics) {
        this.comics = comics;
    }

    /**
     *
     * @return
     * The series
     */
    public Series getSeries() {
        return series;
    }

    /**
     *
     * @param series
     * The series
     */
    public void setSeries(Series series) {
        this.series = series;
    }

    /**
     *
     * @return
     * The stories
     */
    public Stories getStories() {
        return stories;
    }

    /**
     *
     * @param stories
     * The stories
     */
    public void setStories(Stories stories) {
        this.stories = stories;
    }

    /**
     *
     * @return
     * The events
     */
    public Events getEvents() {
        return events;
    }

    /**
     *
     * @param events
     * The events
     */
    public void setEvents(Events events) {
        this.events = events;
    }

    /**
     *
     * @return
     * The urls
     */
    public List<Url> getUrls() {
        return urls;
    }

    /**
     *
     * @param urls
     * The urls
     */
    public void setUrls(List<Url> urls) {
        this.urls = urls;
    }

}
