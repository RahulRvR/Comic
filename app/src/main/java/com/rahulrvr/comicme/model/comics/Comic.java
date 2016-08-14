package com.rahulrvr.comicme.model.comics;

import com.google.gson.annotations.Expose;

import java.util.ArrayList;
import java.util.List;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class Comic {

    @Expose
    private Integer id;
    @Expose
    private Integer digitalId;
    @Expose
    private String title;
    @Expose
    private Integer issueNumber;
    @Expose
    private String variantDescription;
    @Expose
    private String description;
    @Expose
    private String modified;
    @Expose
    private String isbn;
    @Expose
    private String upc;
    @Expose
    private String diamondCode;
    @Expose
    private String ean;
    @Expose
    private String issn;
    @Expose
    private String format;
    @Expose
    private Integer pageCount;
    @Expose
    private List<TextObject> textObjects = new ArrayList<TextObject>();
    @Expose
    private String resourceURI;
    @Expose
    private List<Url> urls = new ArrayList<Url>();
    @Expose
    private Series series;
    @Expose
    private List<Object> variants = new ArrayList<Object>();
    @Expose
    private List<Object> collections = new ArrayList<Object>();
    @Expose
    private List<Object> collectedIssues = new ArrayList<Object>();
    @Expose
    private List<Date> dates = new ArrayList<Date>();
    @Expose
    private List<Price> prices = new ArrayList<Price>();
    @Expose
    private Thumbnail thumbnail;
    @Expose
    private List<Image> images = new ArrayList<Image>();
    @Expose
    private Creators creators;
    @Expose
    private Characters characters;
    @Expose
    private Stories stories;
    @Expose
    private Events events;

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
     * The digitalId
     */
    public Integer getDigitalId() {
        return digitalId;
    }

    /**
     *
     * @param digitalId
     * The digitalId
     */
    public void setDigitalId(Integer digitalId) {
        this.digitalId = digitalId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The issueNumber
     */
    public Integer getIssueNumber() {
        return issueNumber;
    }

    /**
     *
     * @param issueNumber
     * The issueNumber
     */
    public void setIssueNumber(Integer issueNumber) {
        this.issueNumber = issueNumber;
    }

    /**
     *
     * @return
     * The variantDescription
     */
    public String getVariantDescription() {
        return variantDescription;
    }

    /**
     *
     * @param variantDescription
     * The variantDescription
     */
    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
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
     * The isbn
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     *
     * @param isbn
     * The isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     *
     * @return
     * The upc
     */
    public String getUpc() {
        return upc;
    }

    /**
     *
     * @param upc
     * The upc
     */
    public void setUpc(String upc) {
        this.upc = upc;
    }

    /**
     *
     * @return
     * The diamondCode
     */
    public String getDiamondCode() {
        return diamondCode;
    }

    /**
     *
     * @param diamondCode
     * The diamondCode
     */
    public void setDiamondCode(String diamondCode) {
        this.diamondCode = diamondCode;
    }

    /**
     *
     * @return
     * The ean
     */
    public String getEan() {
        return ean;
    }

    /**
     *
     * @param ean
     * The ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }

    /**
     *
     * @return
     * The issn
     */
    public String getIssn() {
        return issn;
    }

    /**
     *
     * @param issn
     * The issn
     */
    public void setIssn(String issn) {
        this.issn = issn;
    }

    /**
     *
     * @return
     * The format
     */
    public String getFormat() {
        return format;
    }

    /**
     *
     * @param format
     * The format
     */
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     *
     * @return
     * The pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    /**
     *
     * @param pageCount
     * The pageCount
     */
    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    /**
     *
     * @return
     * The textObjects
     */
    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    /**
     *
     * @param textObjects
     * The textObjects
     */
    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
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
     * The variants
     */
    public List<Object> getVariants() {
        return variants;
    }

    /**
     *
     * @param variants
     * The variants
     */
    public void setVariants(List<Object> variants) {
        this.variants = variants;
    }

    /**
     *
     * @return
     * The collections
     */
    public List<Object> getCollections() {
        return collections;
    }

    /**
     *
     * @param collections
     * The collections
     */
    public void setCollections(List<Object> collections) {
        this.collections = collections;
    }

    /**
     *
     * @return
     * The collectedIssues
     */
    public List<Object> getCollectedIssues() {
        return collectedIssues;
    }

    /**
     *
     * @param collectedIssues
     * The collectedIssues
     */
    public void setCollectedIssues(List<Object> collectedIssues) {
        this.collectedIssues = collectedIssues;
    }

    /**
     *
     * @return
     * The dates
     */
    public List<Date> getDates() {
        return dates;
    }

    /**
     *
     * @param dates
     * The dates
     */
    public void setDates(List<Date> dates) {
        this.dates = dates;
    }

    /**
     *
     * @return
     * The prices
     */
    public List<Price> getPrices() {
        return prices;
    }

    /**
     *
     * @param prices
     * The prices
     */
    public void setPrices(List<Price> prices) {
        this.prices = prices;
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
     * The images
     */
    public List<Image> getImages() {
        return images;
    }

    /**
     *
     * @param images
     * The images
     */
    public void setImages(List<Image> images) {
        this.images = images;
    }

    /**
     *
     * @return
     * The creators
     */
    public Creators getCreators() {
        return creators;
    }

    /**
     *
     * @param creators
     * The creators
     */
    public void setCreators(Creators creators) {
        this.creators = creators;
    }

    /**
     *
     * @return
     * The characters
     */
    public Characters getCharacters() {
        return characters;
    }

    /**
     *
     * @param characters
     * The characters
     */
    public void setCharacters(Characters characters) {
        this.characters = characters;
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

}
