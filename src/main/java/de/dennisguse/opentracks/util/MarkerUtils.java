package de.dennisguse.opentracks.util;

import android.content.Context;
import android.graphics.drawable.Drawable;

import androidx.annotation.NonNull;

import de.dennisguse.opentracks.R;

public class MarkerUtils {

    public static final int ICON_ID = R.drawable.ic_marker_orange_pushpin_with_shadow;

    private MarkerUtils() {
    }

    public static Drawable getDefaultPhoto(@NonNull Context context) {
        return context.getResources().getDrawable(ICON_ID);
    }
}
