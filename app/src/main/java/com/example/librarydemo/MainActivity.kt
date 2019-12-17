package com.example.librarydemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mydemolibrary.CustomToastMessage

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomToastMessage(this).showToast(this, "Hi from my application", 3,layoutInflater, R.drawable.ic_error_black_24dp)

    }
}
