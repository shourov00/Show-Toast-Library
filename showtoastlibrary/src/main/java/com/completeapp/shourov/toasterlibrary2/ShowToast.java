package com.completeapp.shourov.toasterlibrary2;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Shourov on 09,January,2019
 */
public class ShowToast {

    public static void s(Context context, String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
