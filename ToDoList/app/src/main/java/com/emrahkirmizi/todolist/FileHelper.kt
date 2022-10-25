package com.emrahkirmizi.todolist

import android.content.Context
import java.io.FileOutputStream

class FileHelper {

    val FILENAME = "listinfo.dat"

    //birincisi argümen adı, ikincisi bağam.
    fun writeData(item : ArrayList<String>, context: Context)
    {
        var fos : FileOutputStream = context.openFileOutput(FILENAME,Context.MODE_PRIVATE)
    }


}