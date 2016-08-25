package com.figengungor.iconfontkullanimi;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by figengungor on 25.08.2016.
 */
public class IconTextView extends TextView {

    public IconTextView(Context context) {
        super(context);
        setIconFont();
    }

    public IconTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        setIconFont();
    }

    public IconTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        setIconFont();
    }

    public void setIconFont(){
        Typeface font = Typeface.createFromAsset(getContext().getAssets(),
                "fonts/icomoon.ttf");
        setTypeface(font);
    }
}
