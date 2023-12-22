package com.mohamedrayen.androidproject

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text3 = findViewById<TextView>(R.id.textView03)
        val text1 = findViewById<TextView>(R.id.textview01)
        val btn1 = findViewById<Button>(R.id.button1)
        val edit1 = findViewById<EditText>(R.id.edit)
        val text2 = findViewById<TextView>(R.id.textView02)
        val num  = findViewById<EditText>(R.id.number)
        val btn2 = findViewById<Button>(R.id.button2)
        val edit2 = findViewById<EditText>(R.id.edit2)
        val myImage = findViewById<ImageView>(R.id.imageView)
        myImage.setOnClickListener{
            Toast.makeText(this,"this is an image",Toast.LENGTH_SHORT).show()
        }

        text1.setOnClickListener{
            Toast.makeText(this,"hello mohamed",Toast.LENGTH_SHORT).show()
        }
        btn1.setOnClickListener {
            Toast.makeText(this,"u clicked on button ",Toast.LENGTH_SHORT).show()
            text1.setText("u changed the text").toString()
            text2.setText(edit1.text)
            text3.setText(num.text.toString())
        }
        btn2.setOnClickListener {
            if(btn2.text.toString().equals("show")){
                edit2.transformationMethod = HideReturnsTransformationMethod.getInstance()
                btn2.text = "hide"
            }else {
                edit2.transformationMethod = PasswordTransformationMethod.getInstance()
                btn2.text = "show"
            }
        }


    }
}