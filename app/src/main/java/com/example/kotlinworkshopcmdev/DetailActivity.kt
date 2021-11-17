package com.example.kotlinworkshopcmdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //recieve data from main activity
        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        Toast.makeText(applicationContext,"Username = $username, Password = $password", Toast.LENGTH_LONG).show()
    }
}
