package com.example.coen174

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun getBuildingLocation(building: String): Array<String> {
        return when (building) {
            "SCDI" -> arrayOf("37.34921","-121.93817")
            "Bergin" -> arrayOf("37.34867", "-121.93933")
            "Heafey" -> arrayOf("37.34924", "-121.93964")
            "Benson" -> arrayOf("37.34780", "-121.93948")
            else -> arrayOf("37.34784", "-121.93983")
        }
    }

    fun linkToGoogleMaps(view: View) {
        val mEdit : TextView = findViewById(R.id.buildingInput)
        val building = mEdit.text.toString()
        val lat = getBuildingLocation(building)[0]
        val long = getBuildingLocation(building)[1]

        val gmmIntentUri = Uri.parse("geo:$lat,$long")
        val mapIntent = Intent(Intent.ACTION_VIEW, gmmIntentUri)
        mapIntent.setPackage("com.google.android.apps.maps")
        startActivity(mapIntent)

    }
}