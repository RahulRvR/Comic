package com.rahulrvr.comicme.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.interfaces.IListItemClickListener;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class NavDrawerListViewHolder extends RecyclerView.ViewHolder {

    ImageView characterImage;
    TextView characterName;
    TextView name;

    public NavDrawerListViewHolder(View itemView,int viewType, IListItemClickListener listener) {
        super(itemView);
        if(viewType == 0) {
            this.name = (TextView) itemView.findViewById(R.id.name);
        } else {
            this.characterImage = (ImageView) itemView.findViewById(R.id.rowIcon);
            this.characterName = (TextView) itemView.findViewById(R.id.rowText);
            itemView.setOnClickListener(v -> listener.onItemClicked(characterName.getText().toString()));
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
