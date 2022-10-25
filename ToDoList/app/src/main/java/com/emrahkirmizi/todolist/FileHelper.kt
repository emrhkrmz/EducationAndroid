package com.emrahkirmizi.todolist

import android.content.Context
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream

class FileHelper {

    //veri yazma yöntemi

    val FILENAME = "listinfo.dat"

    //birincisi argümen adı, ikincisi bağam.
    fun writeData(item : ArrayList<String>, context: Context)
    {

        var fos : FileOutputStream = context.openFileOutput(FILENAME,Context.MODE_PRIVATE)

        var oas = ObjectOutputStream(fos)
        oas.writeObject(item)
        oas.close() //önemli

    }

    fun readData(context: Context) : ArrayList<String>
    {

        var itemList : ArrayList<String>
        var fis : FileInputStream = context.openFileInput(FILENAME)
        var ois = ObjectInputStream(fis)

        //verileri nesne olarak okuyacak. bu yüzden onu bir dizeye dönüştürmem gerek.
        //as ArrayList<String>
        itemList = ois.readObject() as ArrayList<String>

        //ayrıca bu yöntem öge listesini döndürmelidir
        return itemList

    }

}