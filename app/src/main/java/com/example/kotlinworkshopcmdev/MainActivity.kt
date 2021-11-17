package com.example.kotlinworkshopcmdev

import android.content.Intent
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

        //switch activity
        val i = Intent(this@MainActivity,DetailActivity::class.java)
        //sent data to detail activity
        i.putExtra("username",username)
        i.putExtra("password",password)

        startActivity(i)

    }


    fun onClickRegister(view:View){
        Toast.makeText(applicationContext,"Register",Toast.LENGTH_LONG).show()
    }
}
