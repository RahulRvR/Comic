package com.rahulrvr.comicme;

import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;

import com.squareup.picasso.Transformation;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class PaletteTransformation implements Transformation{

    private Palette mPalette;


    @Override
    public Bitmap transform(Bitmap source) {

        mPalette = Palette.generate(source);
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
