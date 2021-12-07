package com.example.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Result : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        /*initialize the view in oncreate easily when you just need to use them inside of
        the onCreate method in here I tried it in another way and O encounter error .*/
        val tvName : TextView=findViewById(R.id.tv_Name)
        val result :TextView=findViewById(R.id.tv_result)
        val button : Button = findViewById(R.id.btn_finish)
     /*   notice how you send value from one activity to another and from there to here which is result
                activity and its the place you need that value .*/
        tvName.text=intent.getStringExtra(Constant.USER_NAME)
//        this zero means if we do not get any so as default we have something to use
        val score=intent.getIntExtra(Constant.CORRECT_ANSWER,0)
        val totalQuestions=intent.getIntExtra(Constant.TOTAL_QUESTIONS,0)
        result.text="your score is $score from $totalQuestions questions"

        button.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        }
    }
}