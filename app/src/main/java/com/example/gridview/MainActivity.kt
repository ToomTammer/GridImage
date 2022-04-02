package com.example.gridview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        onClickListener();
    }

    fun onClickListener(){
        img1.setOnClickListener{
            startActivity(Intent(this,Img1Activity::class.java).putExtra("name", "Img1").putExtra("image", R.drawable.im1));
        }

        img2.setOnClickListener{
            startActivity(Intent(this,Img2Activity::class.java).putExtra("name", "Img2").putExtra("image", R.drawable.im2));
        }

        img3.setOnClickListener{
            startActivity(Intent(this,Img3Activity::class.java).putExtra("name", "Img3").putExtra("image", R.drawable.im3));
        }

        img4.setOnClickListener{
            startActivity(Intent(this,Img4Activity::class.java).putExtra("name", "Img4").putExtra("image", R.drawable.im4));
        }

        img5.setOnClickListener{
            startActivity(Intent(this,Img5Activity::class.java).putExtra("name", "Img5").putExtra("image", R.drawable.im5));
        }

        img6.setOnClickListener{
            startActivity(Intent(this,Img6Activity::class.java).putExtra("name", "Img6").putExtra("image", R.drawable.im6));
        }

        img7.setOnClickListener{
            startActivity(Intent(this,Img7Activity::class.java).putExtra("name", "Img7").putExtra("image", R.drawable.im7));
        }

        img8.setOnClickListener{
            startActivity(Intent(this,Img8Activity::class.java).putExtra("name", "Img8").putExtra("image", R.drawable.im8));
        }

        img9.setOnClickListener{
            startActivity(Intent(this,Img9Activity::class.java).putExtra("name", "Img9").putExtra("image", R.drawable.im9));
        }
    }

}