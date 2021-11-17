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
import kotlinx.android.synthetic.main.list_item.view.*

class DetailActivity : AppCompatActivity() {

    //mock up data
    var mDataArray = arrayListOf<ItemBean>()

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

        addDummyData()

        //we have to set adapter when we used recyclerview to show sth from an array
        mRecyclerView.adapter = CustomAdapter()
        mRecyclerView.layoutManager = LinearLayoutManager(this)
    }

    private fun addDummyData(){

        for(i in 1..100){
            mDataArray.add(ItemBean("Cherprang BNK48", "$i : Cherprang Areekul",""))
        }
        //mRecyclerView.adapter!!.notifyDataSetChanged() // refresh /it's work in the tutorial but i'm not


    }

    inner class CustomAdapter : RecyclerView.Adapter<CustomHolder>(){
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomHolder {
              val view = LayoutInflater.from(applicationContext).inflate(R.layout.list_item,parent,false)
              return CustomHolder(view)
        }

        override fun onBindViewHolder(holder: CustomHolder, position: Int) {

            //use this function to update each round
            holder.title.text = mDataArray[position].title
            holder.subtitle.text = mDataArray[position].subtitle

        }

        override fun getItemCount(): Int { // set total row
            //return 20
            return mDataArray.size
        }

    }
    inner class CustomHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        var title = itemView.mTitleTextView
        var subtitle = itemView.mSubtitileTextView
        var image = itemView.mYoutubeImageView
    }
}

