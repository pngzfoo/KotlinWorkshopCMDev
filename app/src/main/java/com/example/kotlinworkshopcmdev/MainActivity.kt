package com.example.kotlinworkshopcmdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClickLogin(view: View){

        val username = mUsername.text.toString()
        val password = mPassword.text.toString()
        Toast.makeText(applicationContext,"Username = $username, Password = $password",Toast.LENGTH_LONG).show()
    }


    fun onClickRegister(view:View){
        Toast.makeText(applicationContext,"Register",Toast.LENGTH_LONG).show()
    }
}
