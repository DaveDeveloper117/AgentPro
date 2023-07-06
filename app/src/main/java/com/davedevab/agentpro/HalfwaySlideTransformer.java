package com.davedevab.agentpro;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;


public class HalfwaySlideTransformer implements ViewPager2.PageTransformer{

    private static final float SCALE_FACTOR = 0.5f;


    @Override
    public void transformPage(@NonNull View page, float position) {
        int pageWidth = page.getWidth();

        if (position < -1 || position > 1){
            page.setScaleX(SCALE_FACTOR);
        } else if (position <=0) {
            page.setScaleX(SCALE_FACTOR + (1 - SCALE_FACTOR) * (1 + position));
        } else {
            page.setScaleX(SCALE_FACTOR + (1 - SCALE_FACTOR) * (1 - position));
        }
    }
}

