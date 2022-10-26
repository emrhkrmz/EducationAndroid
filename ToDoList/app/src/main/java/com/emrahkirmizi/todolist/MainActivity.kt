package com.emrahkirmizi.todolist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var item: EditText
    lateinit var add: Button
    lateinit var listView: ListView

    var itemList = ArrayList<String>()

    //uygulama ilk açıldığında,
    //daha önce kaydedilmiş bir veri olup olmadığını kontrole etmem gerekiyor.
    var fileHelper = FileHelper()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        item = findViewById(R.id.editText)
        add = findViewById(R.id.button)
        listView = findViewById(R.id.list)


        //uygulama ilk açıldığında,
        //daha önce kaydedilmiş bir veri olup olmadığını kontrole etmem gerekiyor.
        itemList = fileHelper.readData(this)

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,android.R.id.text1,itemList)

        //daha önce kaydedilmiş bir veri varsa bunlar ListView'a yazılır.
        listView.adapter = arrayAdapter

        //listeye veri eklemek
        add.setOnClickListener {

            var itemName : String = item.text.toString()
            itemList.add(itemName)
            item.setText("")
            fileHelper.writeData(itemList,applicationContext)
            arrayAdapter.notifyDataSetChanged()

        }

    }
}