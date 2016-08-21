package com.rahulrvr.comicme;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.TabLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;

/**
 *
 *
 */

public class CustomTablayout extends TabLayout {

    public CustomTablayout(Context context) {
        super(context);
    }

    public CustomTablayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomTablayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override public void addTab(@NonNull Tab tab, boolean setSelected) {
        TextView textView = (TextView) View.inflate(getContext(), R.layout.tab_header_view, null);
        textView.setText(tab.getText());
        tab.setCustomView(textView);
        super.addTab(tab, setSelected);
    }

    @Override public void addTab(@NonNull Tab tab, int position, boolean setSelected) {
        super.addTab(tab, position, setSelected);
    }

    @Override public void setSelected(boolean selected) {
        super.setSelected(selected);
    }
}
