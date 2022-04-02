package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_img1.*
import kotlinx.android.synthetic.main.activity_img1.imageView
import kotlinx.android.synthetic.main.activity_img2.*
import kotlinx.android.synthetic.main.activity_img3.*

class Img3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img3)

        var intent: Intent = intent;

        var image:Int = intent.getIntExtra("image", 0);
        var name: String = intent.getStringExtra("name")!!;

        imageView3.setImageResource(image);
        txt3.setText(name);
    }
}