package com.inteligolife.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import kotlinx.android.synthetic.main.activity_main.*

//import android.view.WindowManager
import android.webkit.WebViewClient

import com.onesignal.OneSignal


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // OneSignal Initialization
        OneSignal.startInit(this)
            .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
            .unsubscribeWhenNotificationsAreDisabled(true)
            .init()

        val settings: WebSettings = webView.settings
        settings.javaScriptEnabled = true
        webView.loadUrl("https://www.inteligolife.com/app/")
        webView.webViewClient = WebViewClient() //Open on self window


    }
}
