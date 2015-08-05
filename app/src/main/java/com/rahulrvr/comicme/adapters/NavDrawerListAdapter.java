package com.rahulrvr.comicme.adapters;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.interfaces.IListItemClickListener;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class NavDrawerListAdapter extends RecyclerView.Adapter<NavDrawerListViewHolder> {

    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    Context mContext;
    String[] mCharacterList;
    IListItemClickListener mListener;
    int holderViewType=0;

    public NavDrawerListAdapter(Context context, String[] characters, IListItemClickListener clickListener) {
        mContext = context;
        mCharacterList = characters;
        mListener = clickListener;
    }

    @Override
    public NavDrawerListViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        NavDrawerListViewHolder viewHolder;
        holderViewType = viewType;
        if(viewType == TYPE_HEADER) {
            View v = LayoutInflater.from(mContext).inflate(R.layout.header,parent, false);
            viewHolder = new NavDrawerListViewHolder(v,TYPE_HEADER,mListener);
        } else  {
            View v = LayoutInflater.from(mContext).inflate(R.layout.nav_item_row,parent,false);
            viewHolder = new NavDrawerListViewHolder(v,TYPE_ITEM,mListener);
        }

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(NavDrawerListViewHolder holder, int position) {
        if(holderViewType == TYPE_HEADER) {
            Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "Roboto-Thin.ttf");
            holder.name.setTypeface(typeface);
        } else {
            holder.characterName.setText(mCharacterList[position - 1]);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        }

        return TYPE_ITEM;
    }

    @Override
    public int getItemCount() {
        return mCharacterList.length + 1;
    }
}
