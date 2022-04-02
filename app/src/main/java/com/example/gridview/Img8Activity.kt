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
import kotlinx.android.synthetic.main.activity_img8.*

class Img8Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_img8)

        var intent: Intent = intent;

        var image:Int = intent.getIntExtra("image", 0);
        var name: String = intent.getStringExtra("name")!!;

        imageView8.setImageResource(image);
        txt8.setText(name);
    }
}