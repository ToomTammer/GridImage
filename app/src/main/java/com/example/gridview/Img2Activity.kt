package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_img1.*
import kotlinx.android.synthetic.main.activity_img1.imageView
import kotlinx.android.synthetic.main.activity_img2.*

class Img2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img2)

        var intent: Intent = intent;

        var image:Int = intent.getIntExtra("image", 0);
        var name: String = intent.getStringExtra("name")!!;

        imageView2.setImageResource(image);
        txt2.setText(name);
    }
}