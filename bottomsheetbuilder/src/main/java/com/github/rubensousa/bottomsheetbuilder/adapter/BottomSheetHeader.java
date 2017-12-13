/*
 * Copyright 2016 Rúben Sousa
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.rubensousa.bottomsheetbuilder.adapter;

import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.DrawableRes;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.view.MenuItem;

class BottomSheetHeader implements BottomSheetItem {

    private Drawable mIcon;

    private String mTitle;

    private Drawable mRightIcon;

    @ColorInt
    private int mTextColor;

    @ColorInt
    private int mTintColor;

    @DrawableRes
    private int mBackground;

    private MenuItem mMenuItem;

    public BottomSheetHeader(MenuItem item, Drawable icon, String title, Drawable rightIcon,
                             @ColorInt int color, @DrawableRes int background, @ColorInt int tintColor) {
        mMenuItem = item;
        mIcon = icon;
        mTitle = title;
        mRightIcon = rightIcon;
        mTextColor = color;
        mBackground = background;
        mTintColor = tintColor;

        if (mTintColor != -1) {
            mIcon = DrawableCompat.wrap(mIcon).mutate();
            DrawableCompat.setTint(mIcon, mTintColor);
            mRightIcon = DrawableCompat.wrap(mRightIcon).mutate();
            DrawableCompat.setTint(mRightIcon, mTintColor);
        }
    }

    public MenuItem getMenuItem() {
        return mMenuItem;
    }

    public Drawable getIcon() {
        return mIcon;
    }

    @ColorInt
    public int getTextColor() {
        return mTextColor;
    }

    public Drawable getRightIcon() {
        return mRightIcon;
    }

    @Override
    public String getTitle() {
        return mTitle;
    }

    @DrawableRes
    public int getBackground() {
        return mBackground;
    }
}
