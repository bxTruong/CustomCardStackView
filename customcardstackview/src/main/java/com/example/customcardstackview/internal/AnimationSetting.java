package com.example.customcardstackview.internal;

import android.view.animation.Interpolator;

import com.example.customcardstackview.Direction;

public interface AnimationSetting {
    Direction getDirection();
    int getDuration();
    Interpolator getInterpolator();
}
