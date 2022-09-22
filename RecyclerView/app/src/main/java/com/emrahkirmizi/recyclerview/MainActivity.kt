//video:68 bölüm:1
package com.emrahkirmizi.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var  recyclerView: RecyclerView

    var countryNameList = ArrayList<String>()
    var detailList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var  adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recyclerView.layoutManager = LinearLayoutManager(this)

        countryNameList.add("Türkiye")
        countryNameList.add("United Kingdom")
        countryNameList.add("Germany")
        countryNameList.add("USA")

        detailList.add("This is the Turkey Flag")
        detailList.add("This is the United Kingdom Flag")
        detailList.add("This is the Germany Flag")
        detailList.add("This is the USA Flag")

        imageList.add(R.drawable.turkey)
        imageList.add(R.drawable.england)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.america)

        adapter = CountriesAdapter(countryNameList,detailList,imageList,this@MainActivity)

        recyclerView.adapter = adapter

    }
}