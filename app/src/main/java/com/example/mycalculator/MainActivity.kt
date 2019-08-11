package com.example.mycalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun btnOnClick(view: View) {
        var msg = ""
        val btnSelected = view as Button
        when (btnSelected.id) {
            button1.id -> msg = "1$msg"
            button2.id -> msg = "2$msg"
            button3.id -> msg = "3$msg"
            button4.id -> msg= "4$msg"
            button5.id -> msg = "5$msg"
            button6.id -> msg = "6$msg"
            button7.id -> msg = "7$msg"
            button8.id -> msg = "8$msg"
            button9.id -> msg= "9$msg"
            button0.id -> msg = "0$msg"
            buttonPoint.id->msg=".$msg"
            buttonAC.id->msg=""
        }

        textView.text=msg
    }

//    fun btnOnClick2(view: View){
//        buttonDivide.id->msg= $msg
//    }
}
