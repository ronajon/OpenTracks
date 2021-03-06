/*
 * Copyright 2012 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package de.dennisguse.opentracks.util;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;

import de.dennisguse.opentracks.R;

/**
 * Utilities for creating dialogs.
 *
 * @author Jimmy Shih
 */
public class DialogUtils {

    private DialogUtils() {
    }

    /**
     * Creates a confirmation dialog.
     *
     * @param context    the context
     * @param titleId    the title
     * @param message    the message
     * @param okListener the listener when OK is clicked
     */
    public static Dialog createConfirmationDialog(final Context context, int titleId, String message, DialogInterface.OnClickListener okListener) {
        return new AlertDialog.Builder(context)
                .setCancelable(true)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .setMessage(message)
                .setNegativeButton(R.string.generic_no, null)
                .setPositiveButton(R.string.generic_yes, okListener)
                .setTitle(titleId).create();
    }

    /**
     * Creates a horizontal progress dialog.
     *
     * @param context          the context
     * @param messageId        the progress message id
     * @param onCancelListener the cancel listener
     * @param formatArgs       the format arguments for the messageId
     */
    public static ProgressDialog createHorizontalProgressDialog(Context context, int messageId, DialogInterface.OnCancelListener onCancelListener, Object... formatArgs) {
        return createProgressDialog(context, messageId, onCancelListener, formatArgs);
    }

    /**
     * Creates a progress dialog.
     *
     * @param context          the context
     * @param messageId        the progress message id
     * @param onCancelListener the cancel listener
     * @param formatArgs       the format arguments for the message id
     */
    private static ProgressDialog createProgressDialog(final Context context, int messageId, DialogInterface.OnCancelListener onCancelListener, Object... formatArgs) {
        final ProgressDialog progressDialog = new ProgressDialog(context, R.style.ThemeCustomNotTransparentDialog);
        progressDialog.setCancelable(true);
        progressDialog.setCanceledOnTouchOutside(false);
        progressDialog.setIcon(R.drawable.ic_dialog_info_24dp);
        progressDialog.setIndeterminate(true);
        progressDialog.setMessage(context.getString(messageId, formatArgs));
        progressDialog.setOnCancelListener(onCancelListener);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        progressDialog.setTitle(R.string.generic_progress_title);
        return progressDialog;
    }
}
