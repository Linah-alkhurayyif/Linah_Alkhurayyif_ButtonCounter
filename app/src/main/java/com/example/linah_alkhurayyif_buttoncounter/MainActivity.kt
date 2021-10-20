package com.example.linah_alkhurayyif_buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var startnumber=26
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener {
            startnumber++
            number_tv.text=startnumber.toString()
        }
        minimize.setOnClickListener {
            startnumber--
            number_tv.text=startnumber.toString()
        }
    }
}