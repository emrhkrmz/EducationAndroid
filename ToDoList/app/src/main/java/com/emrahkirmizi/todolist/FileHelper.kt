package com.emrahkirmizi.todolist

import android.content.Context
import java.io.*

class FileHelper {

    val FILENAME = "listinfo.dat"

    //veri yazma yöntemi
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

        //uygulama ilk açıldığında dosya olmasa bile boş bir dizi listesi oluşturulur ve
        //liste görünümü boş olarak görüntülenir
        try {

            var fis : FileInputStream = context.openFileInput(FILENAME)
            var ois = ObjectInputStream(fis)

            //verileri nesne olarak okuyacak. bu yüzden onu bir dizeye dönüştürmem gerek.
            //as ArrayList<String>
            itemList = ois.readObject() as ArrayList<String>

        }catch (e : FileNotFoundException) { //yakalama blokları

            itemList = ArrayList()

        }

        //ayrıca bu yöntem öge listesini döndürmelidir
        return itemList

    }

}