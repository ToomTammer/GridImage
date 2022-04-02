package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_img1.*
import kotlinx.android.synthetic.main.activity_img1.imageView
import kotlinx.android.synthetic.main.activity_img2.*
import kotlinx.android.synthetic.main.activity_img3.*
import kotlinx.android.synthetic.main.activity_img4.*
import kotlinx.android.synthetic.main.activity_img5.*
import kotlinx.android.synthetic.main.activity_img7.*

class Img7Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img7)

        var intent: Intent = intent;

        var image:Int = intent.getIntExtra("image", 0);
        var name: String = intent.getStringExtra("name")!!;

        imageView7.setImageResource(image);
        txt7.setText(name);
    }
}