package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnStart: Button = findViewById<Button>(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)
        btnStart.setOnClickListener {
            if (etName.text.isEmpty()) {
                Toast.makeText(
                    this,
                    "the name filed must not be empty", Toast.LENGTH_LONG
                ).show()
            } else {
/*
            by intent we are saying we are going from this context to the quizquestionactivity
*/
                val intent = Intent(this, QuizQuestionActivity::class.java)
            /*    it is a method we use to send the data to other activities and good practice
                is to use the constants and then embed the data you wanna send to the constant and send it
                        over */
                intent.putExtra(Constant.USER_NAME,etName.text.toString())
//            but the intent by its own do not start the new activity to do so we use this class
                startActivity(intent)
//            and to finish the current activity we have to say
                finish()

            }
        }

    }
}