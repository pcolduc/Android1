package com.koreait.android0722_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var text2 : TextView
    lateinit var chkAgree : CheckBox
    lateinit var rGroup1 : RadioGroup
    lateinit var radRealDuck : RadioButton
    lateinit var radDallDuck : RadioButton
    lateinit var radClassDuck : RadioButton
    lateinit var btnOk : Button
    lateinit var imgDuck : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1 = findViewById(R.id.Text1)
        text2 = findViewById(R.id.Text2)

        chkAgree = findViewById(R.id.ChkAgree)

        rGroup1 = findViewById(R.id.Rgroup1)

        radRealDuck = findViewById(R.id.RadRealDuck)
        radDallDuck = findViewById(R.id.RadDallDuck)
        radClassDuck = findViewById(R.id.RadClassDuck)

        btnOk = findViewById(R.id.BtnOk)

        imgDuck = findViewById(R.id.ImgDuck)

        chkAgree.setOnCheckedChangeListener { compoundButton, b ->
            if (chkAgree.isChecked == true){
                text2.visibility = android.view.View.VISIBLE
                rGroup1.visibility = android.view.View.VISIBLE
                btnOk.visibility = android.view.View.VISIBLE
                imgDuck.visibility = android.view.View.VISIBLE
            }else{
                text2.visibility = android.view.View.INVISIBLE
                rGroup1.visibility = android.view.View.INVISIBLE
                btnOk.visibility = android.view.View.INVISIBLE
                imgDuck.visibility = android.view.View.INVISIBLE
            }
            btnOk.setOnClickListener {
                when(rGroup1.checkedRadioButtonId){
                    R.id.RadRealDuck -> imgDuck.setImageResource(R.drawable.duck)
                    R.id.RadDallDuck -> imgDuck.setImageResource(R.drawable.dududuck)
                    R.id.RadClassDuck -> imgDuck.setImageResource(R.drawable.duckdu)

                }
            }
        }

    }
}