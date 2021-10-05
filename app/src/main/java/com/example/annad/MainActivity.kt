package com.example.annad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button=findViewById<Button>(R.id.button)
        val textView=findViewById<TextView>(R.id.textView)
        val buttonPlus=findViewById<Button>(R.id.buttonPlus)
        val buttonMinus=findViewById<Button>(R.id.buttonMinus)
        val buttonMultiply=findViewById<Button>(R.id.buttonMultiply)
        val buttonDivide=findViewById<Button>(R.id.buttonDivide)
        val editTextNumber1=findViewById<EditText>(R.id.editTextNumber1)
        val editTextNumber2=findViewById<EditText>(R.id.editTextNumber2)


        button.setOnClickListener {
            val text="Hello my amazing world!=)"
            textView.text=text
        }

        buttonPlus.setOnClickListener {
            val a=editTextNumber1.text.toString().toDouble()
            val b=editTextNumber2.text.toString().toDouble()
            val c=myPlus(a,b)
            textView.text=c.toString()
        }

        buttonMinus.setOnClickListener {
            val a=editTextNumber1.text.toString().toDouble()
            val b=editTextNumber2.text.toString().toDouble()
            val c=myMinus(a,b)
            textView.text=c.toString()
        }

        buttonMultiply.setOnClickListener {
            val a=editTextNumber1.text.toString().toDouble()
            val b=editTextNumber2.text.toString().toDouble()
            val c=myMultiply(a,b)
            textView.text=c.toString()
        }

        buttonDivide.setOnClickListener {
            val a=editTextNumber1.text.toString().toDouble()
            val b=editTextNumber2.text.toString().toDouble()
            val c=myDivide(a,b)
            textView.text=c.toString()
        }

        val mydog= Dog("Dusya", 3)
        mydog.run(20)
        textView.text=mydog.name

    }


    fun myPlus(a:Double, b:Double):Double {
        val c=a+b
        return c
    }

    fun myMinus(a:Double, b:Double):Double {
        val c=a-b
        return c
    }

    fun myMultiply(a:Double, b:Double):Double {
        val c=a*b
        return c
    }

    fun myDivide(a:Double, b:Double): Any {
        if(b== 0.0){
           val c="Деление на 0 невозможно"
        return c}
           val c = a / b
           return c
    }
}