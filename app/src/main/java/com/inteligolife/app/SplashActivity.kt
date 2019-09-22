package com.inteligolife.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        val welcomeThread = object : Thread() {

            override fun run() {
                try {
                    super.run()
                    sleep(3000)  //Delay of 3 seconds
                } catch (e: Exception) {

                } finally {

                    val i = Intent(
                        this@SplashActivity,
                        MainActivity::class.java
                    )
                    startActivity(i)
                    finish()
                }
            }
        }
        welcomeThread.start()

    }
}
