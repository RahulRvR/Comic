package com.rahulrvr.comicme.adapters;

import android.content.Context;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rahulrvr.comicme.PaletteTransformation;
import com.rahulrvr.comicme.R;
import com.rahulrvr.comicme.model.characters.Character;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Copyright (c) 2015 Elsevier, Inc. All rights reserved.
 */
public class CharacterListAdapter extends RecyclerView.Adapter<CharacterViewHolder>{

    Context mContext;
    List<Character> mCharacterList;

    public CharacterListAdapter(Context context, List<Character> characters) {
        mContext = context;
        mCharacterList = characters;
    }

    @Override
    public CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.characters_adapter_layout,null);
        CharacterViewHolder viewHolder = new CharacterViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CharacterViewHolder holder, int position) {
        Character character = mCharacterList.get(position);
        holder.characterName.setText(character.getName());
        if(character.getThumbnail()!=null) {
            String url = character.getThumbnail().getPath() + "/standard_amazing." + character.getThumbnail().getExtension();
            PaletteTransformation paletteTransformation = new PaletteTransformation();
            Picasso.with(mContext).load(url).
                    transform(paletteTransformation).
                    into(holder.characterImage, new Callback.EmptyCallback() {
                        @Override
                        public void onSuccess() {
                            super.onSuccess();
                            Palette palette = paletteTransformation.getPalette();
                            //Typeface typeface = Typeface.createFromAsset(mContext.getAssets(), "RobotoCondensed-Bold.ttf");
                            //holder.characterName.setTypeface(typeface);
                            if (palette != null) {
                                Palette.Swatch swatch = palette.getVibrantSwatch();
                                holder.characterName.setBackgroundColor(palette.getVibrantColor(0));
                                if (swatch != null)
                                    holder.characterName.setTextColor(swatch.getTitleTextColor());
                            }
                        }
                    });
        }
    }

    @Override
    public int getItemCount() {
        return mCharacterList.size();
    }
}
