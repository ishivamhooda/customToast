package com.example.customtoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cl:ConstraintLayout=findViewById(R.id.constraint_layout)
        val ll=findViewById<LinearLayout>(R.id.ll_wrapped)

        val layout=layoutInflater.inflate(R.layout.custom_toast,ll)

        cl.setOnClickListener{
            Toast(this).apply{
                duration=Toast.LENGTH_LONG
                setGravity(Gravity.CENTER,0,0)
                view=layout
            }.show()
        }
    }

}