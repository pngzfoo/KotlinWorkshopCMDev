package com.example.kotlinworkshopcmdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLogin(view: View){
        Toast.makeText(applicationContext,"Login",Toast.LENGTH_LONG).show()
    }


    fun onClickRegister(view:View){
        Toast.makeText(applicationContext,"Register",Toast.LENGTH_LONG).show()
    }
}
