package br.az.dokkatest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

/**
 * @author Namig Gadirov
 * Email: namiqqedirov01@gmail.com, namig.gadirov@bankrespublika.az
 * Copyright. All rights reserved
 * this Class is main activity of this project
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val objectOfObject = Object("Test")
        objectOfObject.parametersWithReturn("Hello World")
        objectOfObject.versionAndSince()
        try {
            objectOfObject.exceptionThrow()
        } catch (e: Exception) {
            Toast.makeText(applicationContext, "Exception method called", Toast.LENGTH_LONG).show()
        }
    }
}
