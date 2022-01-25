package com.wrmh.cursomoviles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var plusBtn: Button
    private lateinit var minusBtn: Button
    private lateinit var counter: TextView
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plusBtn = findViewById(R.id.plus_btn)
        minusBtn = findViewById(R.id.minus_btn)
        counter = findViewById(R.id.count)

        counter.text = count.toString()

        plusBtn.setOnClickListener {
            count++
            counter.text = count.toString()
        }

        minusBtn.setOnClickListener {
            count--
            counter.text = count.toString()
        }
    }
}