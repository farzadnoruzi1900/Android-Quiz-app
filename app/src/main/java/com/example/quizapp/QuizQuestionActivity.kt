package com.example.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class QuizQuestionActivity : AppCompatActivity() {
    var tvquestion : TextView?=null
    var tvimage : ImageView?=null
    var progress : ProgressBar? =null
    var tvprogress : TextView?=null
    var tvoptionOne : TextView?=null
    var tvoptionTwo : TextView?=null
    var tvoptionthree : TextView?=null
    var tvoptionfour : TextView?=null

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        tvquestion=findViewById(R.id.tv_question)
        tvimage=findViewById(R.id.iv_flag)
        progress=findViewById(R.id.progress_bar)
        tvprogress=findViewById(R.id.tv_progress)
        tvoptionOne=findViewById(R.id.tv_option_one)
        tvoptionTwo=findViewById(R.id.tv_option_two)
        tvoptionthree=findViewById(R.id.tv_option_three)
        tvoptionfour=findViewById(R.id.tv_option_four)

        val questions = Constant.getQuestions()
        Log.i("the questionSize is ","${questions.size}")

        var currentQuestion=1
        val question =questions[currentQuestion-1]
        progress?.progress=currentQuestion
        tvquestion?.text=question.title
        tvimage?.setImageResource(question.image)
        tvprogress?.text="${currentQuestion}/${questions.size}"
        tvoptionTwo?.text="${question.optionTwo}"
        tvoptionthree?.text="${question.optionThree}"
        tvoptionfour?.text="${question.optionFour}"
        tvoptionOne?.text="${question.optionOne}"



    }
}