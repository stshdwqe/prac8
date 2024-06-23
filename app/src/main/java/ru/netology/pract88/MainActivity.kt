package ru.netology.pract88

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rButton: Button = findViewById(R.id.red_button)
        val yButton: Button = findViewById(R.id.yellow_button)
        val gButton: Button = findViewById(R.id.green_button)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val textSize = 90
        rButton.setOnClickListener {
            textView.text = "Красный"
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize.toFloat())
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor,null))
        }
        yButton.setOnClickListener {
            textView.text = "Жёлтый"
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, 50f)
            rLayout.setBackgroundColor(resources.getColor(R.color.yellowColor,null))
        }
        gButton.setOnClickListener {
            textView.text = "Зелёный"
            textView.setTextSize(TypedValue.COMPLEX_UNIT_PX, textSize.toFloat())
             rLayout.setBackgroundColor(resources.getColor(R.color.greenColor,null))
        }
    }
}