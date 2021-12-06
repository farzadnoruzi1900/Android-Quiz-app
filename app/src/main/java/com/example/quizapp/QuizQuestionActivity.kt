package com.example.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {
    private var tvquestion: TextView? = null
    private var tvimage: ImageView? = null
    private var progress: ProgressBar? = null
    private var tvprogress: TextView? = null
    private var tvoptionOne: TextView? = null
    private var tvoptionTwo: TextView? = null
    private var tvoptionthree: TextView? = null
    private var tvoptionfour: TextView? = null
    private var btnSubmit: Button? = null


    private var questionList: ArrayList<Question>? = null
    private var mCurrentPosition: Int = 1
    private var mSelectedOptionPsition: Int = 0

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)
        findViewsByIds()
        questionList = Constant.getQuestions()

        setQuestion()


        tvoptionTwo?.setOnClickListener(this)
        tvoptionthree?.setOnClickListener(this)
        tvoptionfour?.setOnClickListener(this)
        tvoptionOne?.setOnClickListener(this)
        btnSubmit?.setOnClickListener(this)

    }

    private fun findViewsByIds() {
        tvquestion = findViewById(R.id.tv_question)
        tvimage = findViewById(R.id.iv_flag)
        progress = findViewById(R.id.progress_bar)
        tvprogress = findViewById(R.id.tv_progress)
        tvoptionOne = findViewById(R.id.tv_option_one)
        tvoptionTwo = findViewById(R.id.tv_option_two)
        tvoptionthree = findViewById(R.id.tv_option_three)
        tvoptionfour = findViewById(R.id.tv_option_four)
        btnSubmit = findViewById(R.id.btn_submit)
    }

    private fun setQuestion() {
        val question = questionList!![mCurrentPosition - 1]
        progress?.progress = mCurrentPosition
        tvquestion?.text = question.title
        tvimage?.setImageResource(question.image)
        tvprogress?.text = "${mCurrentPosition}/${questionList?.size}"
        tvoptionTwo?.text = "${question.optionTwo}"
        tvoptionthree?.text = "${question.optionThree}"
        tvoptionfour?.text = "${question.optionFour}"
        tvoptionOne?.text = "${question.optionOne}"
        if (mCurrentPosition == questionList?.size) {
            btnSubmit?.text = "FINISH"
        } else {
            btnSubmit?.text = "SUBMIT"
        }
    }

    /* we are creating this method in order to find a way that when we click on an option
     from four option that we hav ethe border color change to purple as we set the new drawable called
     selected_option_border_bg*/
    private fun defaultOptionView() {
        var options = ArrayList<TextView>()
        tvoptionOne?.let {
            options.add(0, it)
        }
        tvoptionTwo?.let {
            options.add(1, it)
        }
        tvoptionthree?.let {
            options.add(2, it)
        }
        tvoptionfour?.let {
            options.add(3, it)
        }
        for (option in options) {
            option.setTextColor(Color.parseColor("#7a8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(view: TextView, selectedOptionNum: Int) {
        defaultOptionView()
        mSelectedOptionPsition = selectedOptionNum
        view.setTextColor(Color.parseColor("#363A43"))
        view.setTypeface(view.typeface, Typeface.BOLD)
        view.background = ContextCompat.getDrawable(
            this,
            R.drawable.selected_option_border_bg
        )
    }

    /* this method here is super amazing we are using this to get rid of all the setListener in the
     mainactivity method instead we just need to say         btnSubmit?.setOnClickListener(this)
 */
    override fun onClick(view: View?) {
        when (view?.id) {
            R.id.tv_option_one -> {
                tvoptionOne?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.tv_option_two -> {
                tvoptionTwo?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.tv_option_three -> {
                tvoptionthree?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.tv_option_four -> {
                tvoptionfour?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.btn_submit -> {
//TODO
            }
        }

    }
}