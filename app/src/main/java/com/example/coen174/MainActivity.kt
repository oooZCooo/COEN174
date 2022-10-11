package com.example.coen174

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun linkToGoogleMaps(view: View) {
        val lat = "37.34784"
        val long = "-121.93983"
        /*val mapUrl = "https://www.google.com/maps/@$lat,$long,15z"
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(mapUrl));
        startActivity(browserIntent);

         */
        val gmmIntentUri = Uri.parse("geo:$lat,$long")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)
    }
}