package com.example.movie_kp.util.extensition

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar

fun AppCompatActivity.setUpToolBar(toolbar: Toolbar, titleText: String = "") {
    setSupportActionBar(toolbar)
    supportActionBar?.run {
        title = titleText
    }
}