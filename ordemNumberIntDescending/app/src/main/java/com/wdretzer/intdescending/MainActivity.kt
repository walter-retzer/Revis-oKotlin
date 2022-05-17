package com.wdretzer.intdescending

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private val resposta: TextView
        get() = findViewById(R.id.resposta)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resposta.text = descendingOrder(1367).toString()
    }

    private fun descendingOrder(number: Int): Int {
        val numberToString = number.toString()
        val sizeNumberReceive = numberToString.length
        val listNumberInt = arrayListOf<Int>()

        for (i in 0 until sizeNumberReceive) {
            listNumberInt.add(numberToString[i].toString().toInt())
        }

        val numbersDescending = listNumberInt.toList().sortedDescending().toString()
            .replace("[", "")
            .replace(",", "")
            .replace("]", "")
            .replace(" ", "")

        return numbersDescending.toInt()
    }
}
