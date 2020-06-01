package com.example.lottiefileanimation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animationView.setAnimation("lightning.json")
        //animationView.speed = 5f

        val time = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000)

                    //if you want to go to another view
                    /*val intent = Intent(baseContext, HomeActivity::class.java)
                    startActivity(intent)
                    finish()*/
                } catch (e: Exception){
                    e.printStackTrace()
                }
            }
        }
        time.start()
    }
}
