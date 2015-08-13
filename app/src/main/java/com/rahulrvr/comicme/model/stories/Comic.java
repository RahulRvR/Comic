package com.rahulrvr.comicme.model.stories;

import com.google.gson.annotations.Expose;

/**
 * Created by rahulrv on 8/11/15.
 */
public class Comic {

    @Expose
    int code;
    @Expose
    String status;
    @Expose
    String copyright;
    @Expose
    String attributionText;
    @Expose
    String attributionHTML;

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Expose
    Data data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getAttributionText() {
        return attributionText;
    }

    public void setAttributionText(String attributionText) {
        this.attributionText = attributionText;
    }

    public String getAttributionHTML() {
        return attributionHTML;
    }

    public void setAttributionHTML(String attributionHTML) {
        this.attributionHTML = attributionHTML;
    }
}
