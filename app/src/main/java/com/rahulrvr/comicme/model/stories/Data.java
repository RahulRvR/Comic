package com.rahulrvr.comicme.model.stories;

import com.google.gson.annotations.Expose;

import java.util.List;

/**
 * Created by rahulrv on 8/11/15.
 */
public class Data {
    @Expose
    int offset;
    @Expose
    int limit;
    @Expose
    int total;
    @Expose
    int count;
    @Expose
    List<Result> results;


    public int getOffset() {
        return offset;
    }

    public int getLimit() {
        return limit;
    }

    public int getTotal() {
        return total;
    }

    public int getCount() {
        return count;
    }

    public List<Result> getResult() {
        return results;
    }
}
