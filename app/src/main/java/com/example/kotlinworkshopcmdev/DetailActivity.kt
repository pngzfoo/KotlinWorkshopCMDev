package com.example.kotlinworkshopcmdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        //receive data from main activity
        /*val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")*/

        //receive data using parcelable
        val acc = intent.getParcelableExtra<Account>("account")

        //Toast.makeText(applicationContext,"Username = ${username}, Password = ${password}", Toast.LENGTH_LONG).show()
        //show toast using parcelable
        Toast.makeText(applicationContext,"Username = ${acc?.username}, Password = ${acc?.password}", Toast.LENGTH_LONG).show()
    }
}
