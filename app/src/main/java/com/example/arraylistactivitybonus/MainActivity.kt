package com.example.arraylistactivitybonus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var et1:EditText
    lateinit var et2:EditText

    lateinit var btn1:Button
    lateinit var btn2:Button

    lateinit var tv:TextView

    lateinit var myarray:ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        et1 = findViewById(R.id.editTextTextPersonName)
        et2 = findViewById(R.id.editTextTextPersonName2)

        tv = findViewById(R.id.textView)

        btn1 = findViewById(R.id.button)
        btn2 = findViewById(R.id.button2)

        myarray = arrayListOf()
        btn1.setOnClickListener {
            myarray.add(et1.text.toString())
            et1.text.clear()
        Toast.makeText(this,"Saved",Toast.LENGTH_SHORT).show()
        }
        btn2.setOnClickListener {
            var rr = et2.text.toString().toInt() - 1
            if (rr < myarray.size) {
                tv.text = myarray[rr]
                et2.text.clear()
            }else{
                Toast.makeText(this,"empty",Toast.LENGTH_SHORT).show()
            }
        }
    }
}