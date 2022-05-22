package com.example.lesson_5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var textView: TextView? = null
    private var btnPlus: Button? = null
    private var sum = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.text_view)
        btnPlus = findViewById(R.id.plus)
        btnPlus?.setOnClickListener {
            sum++
            textView?.text = sum.toString()
            sum--
            textView ?. text = sum . toString ()


            if (sum < 11 && btnPlus?.text == "+1") {
                sum++
                textView ?. text = sum . toString ()
                if (sum == 10) {
                    btnPlus?.text = "-1"
                }
            } else {
                sum--
                textView ?. text = sum . toString ()
                if (sum == 0 && btnPlus?.text == "-1") {
                    btnPlus?.text = "+1"
                }
            }

        }
    }
}
