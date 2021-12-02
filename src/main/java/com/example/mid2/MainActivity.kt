package com.example.mid2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      val imageView=findViewById<ImageView>(R.id.s)
        imageView.setOnClickListener {
            startActivity(Intent(this,AnimationActivity::class.java))}}}