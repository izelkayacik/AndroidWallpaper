package com.izelkayacik.androidwallpaper

import android.annotation.SuppressLint
import android.app.WallpaperManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        wallpaper_image.setImageResource(R.drawable.jokerwallpaper)
        set_wallpaper.setOnClickListener {
            val wallpaperManager: WallpaperManager = WallpaperManager.getInstance(this)
            wallpaperManager.setResource(R.drawable.jokerwallpaper)
        }

    }
}