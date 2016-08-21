package com.rahulrvr.comicme;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;

import com.squareup.picasso.Transformation;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class PaletteTransformation implements Transformation{

    private Palette mPalette;


    @Override
    public Bitmap transform(Bitmap source) {

        mPalette = Palette.from(source).generate();
        return source;
    }

    @Override
    public String key() {
        return "transform";
    }

    public Palette getPalette() {
        return mPalette;
    }

}
