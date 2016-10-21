package com.example.hong.stylei;

import android.graphics.drawable.Drawable;

/**
 * Created by hong on 2016. 10. 19..
 */

public class ListViewItem {
    private Drawable iconDrawable;
    private String titleStr;
    private String descStr;

    public String getDescStr() {
        return descStr;
    }

    public void setDescStr(String descStr) {
        this.descStr = descStr;
    }

    public Drawable getIconDrawable() {
        return iconDrawable;
    }

    public void setIconDrawable(Drawable iconDrawable) {
        this.iconDrawable = iconDrawable;
    }

    public String getTitleStr() {
        return titleStr;
    }

    public void setTitleStr(String titleStr) {
        this.titleStr = titleStr;
    }
}
