package com.example.dotinstallapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    // 画面が最初に作られた時
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun changeTextView(view: View){
        var messageTextView = findViewById<TextView>(R.id.messageTextView)
        messageTextView.text = "Hello World!"

    }
}