package com.example.kotlinworkshopcmdev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_detail.*

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

        //we have to set adapter when we used recyclerview
        mRecyclerView.adapter = CustomAdapter()
        mRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    inner class CustomAdapter : RecyclerView.Adapter<CustomHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
              val view = LayoutInflater.from(applicationContext).inflate(R.layout.list_item,parent,false)
              return CustomHolder(view)
        }

        override fun onBindViewHolder(holder: CustomHolder, position: Int) {

        }

        override fun getItemCount(): Int { // set total row
            return 20
        }

    }
    inner class CustomHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }
}

