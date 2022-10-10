package com.example.paintapp

import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.example.paintapp.PaintView.Companion.colorList
import com.example.paintapp.PaintView.Companion.currentBrush
import com.example.paintapp.PaintView.Companion.pathList

class MainActivity : AppCompatActivity() {

    companion object {
        var path = Path()
        var paintBrush = Paint()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        val greenBt = findViewById<ImageButton>(R.id.greenColor)
        val redBt = findViewById<ImageButton>(R.id.redColor)
        val blueBt = findViewById<ImageButton>(R.id.blueColor)
        val blackBt = findViewById<ImageButton>(R.id.blackColor)
        val eraser = findViewById<ImageButton>(R.id.whiteColor)

        greenBt.setOnClickListener {
            paintBrush.color = Color.GREEN
            currentColor(paintBrush.color)
        }

        redBt.setOnClickListener {
            paintBrush.color = Color.RED
            currentColor(paintBrush.color)
        }

        blueBt.setOnClickListener {
            paintBrush.color = Color.BLUE
            currentColor(paintBrush.color)
        }

        blackBt.setOnClickListener {
            paintBrush.color = Color.BLACK
            currentColor(paintBrush.color)
        }

        eraser.setOnClickListener {
            pathList.clear()
            colorList.clear()
            path.reset()
        }
    }

    private fun currentColor(color: Int){
        currentBrush = color
        path = Path()
    }
}