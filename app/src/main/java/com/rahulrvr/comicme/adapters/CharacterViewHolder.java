package com.rahulrvr.comicme.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahulrvr.comicme.R;

/**
 * Copyright (c) 2015 rVr, Inc. All rights reserved.
 */
public class CharacterViewHolder extends RecyclerView.ViewHolder {

    ImageView characterImage;
    TextView characterName;

    public CharacterViewHolder(View itemView) {
        super(itemView);
        this.characterImage = (ImageView) itemView.findViewById(R.id.characterImage);
        this.characterName = (TextView) itemView.findViewById(R.id.characterName);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
