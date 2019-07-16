package com.anwesh.uiprojects.linkedmidlinetriballview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.midlinetriballview.MidTriLineBallView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        MidTriLineBallView.create(this)
    }
}
