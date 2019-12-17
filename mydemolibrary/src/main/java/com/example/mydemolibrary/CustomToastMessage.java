package com.example.mydemolibrary;

import android.content.Context;
import android.widget.Toast;

public class CustomToastMessage {

    public static void showToast(Context context, String message, int duration) {
        Toast.makeText(context, message, duration).show();
    }

}
