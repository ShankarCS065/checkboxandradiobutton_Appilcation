package com.krashkrosh748199.checkboxandradiobutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnFirst=findViewById<Button>(R.id.btnOrder)
        val tvFirst=findViewById<TextView>(R.id.tvQuestion)
        val rgFirst=findViewById<RadioGroup>(R.id.rgMeat)
        val rbFirst=findViewById<RadioButton>(R.id.rbBeef)
        val rbSecond=findViewById<RadioButton>(R.id.rbChicken)
        val rbThird=findViewById<RadioButton>(R.id.rbPork)
        val cbFirst=findViewById<CheckBox>(R.id.cbCheese)
        val cbSecond=findViewById<CheckBox>(R.id.cbOnions)
        val cbThird=findViewById<CheckBox>(R.id.cbSalad)
        val tvSecond=findViewById<TextView>(R.id.tvOrder)

        btnFirst.setOnClickListener{
            val checkedMeatRadioButtonId=rgFirst.checkedRadioButtonId
            val meat =findViewById<RadioButton>(checkedMeatRadioButtonId)
            val cheese=cbFirst.isChecked
            val onions=cbSecond.isChecked
            val salad=cbThird.isChecked
            val orderString="You ordered a burger with:\n"+
                    "${meat.text}"+
                    (if(cheese)"\nCheese" else "")+
                    (if(onions)"\nOnions" else " ")+
                    (if(salad)"\nSalad" else " ")
            tvSecond.text=orderString

        }
    }
}