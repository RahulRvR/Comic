package com.rahulrvr.comicme.model.stories;

import com.google.gson.annotations.Expose;
import com.rahulrvr.comicme.model.comics.TextObject;

import java.util.List;

/**
 * Created by rahulrv on 8/11/15.
 */
public class Result {
    @Expose
    int id;
    @Expose
    int digitalId;
    @Expose
    String title;
    @Expose
    int issueNumber;
    @Expose
    String variantDescription;
    @Expose
    String description;
    @Expose
    List<TextObject> textObjects;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDigitalId() {
        return digitalId;
    }

    public void setDigitalId(int digitalId) {
        this.digitalId = digitalId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getVariantDescription() {
        return variantDescription;
    }

    public void setVariantDescription(String variantDescription) {
        this.variantDescription = variantDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<TextObject> getTextObjects() {
        return textObjects;
    }

    public void setTextObjects(List<TextObject> textObjects) {
        this.textObjects = textObjects;
    }
}
