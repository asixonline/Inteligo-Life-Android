package com.inteligolife.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_main.*

//import android.view.WindowManager
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl("http://dev.asixonline.com/inteligolife_app/")
        webView.webViewClient = WebViewClient() //Open on self window


    }
}
