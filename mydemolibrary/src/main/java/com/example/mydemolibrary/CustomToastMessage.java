package com.example.mydemolibrary;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class CustomToastMessage extends View {

    public CustomToastMessage(Context context) {
        super(context);
    }

    public void showToast(Context context, String message, int duration, LayoutInflater inflater, int imageResource) {
        View layout = inflater.inflate(R.layout.toast_item, (ViewGroup) findViewById(R.id.toast_layout_root));

        ImageView image = layout.findViewById(R.id.image);
        image.setImageResource(imageResource);
        TextView text = layout.findViewById(R.id.text);
        text.setText(message);

        Toast toast = new Toast(context.getApplicationContext());
        toast.setDuration(duration);
        toast.setView(layout);
        toast.show();
    }

}
