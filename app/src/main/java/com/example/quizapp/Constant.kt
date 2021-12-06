package com.example.quizapp

object Constant {
    fun getQuestions():ArrayList<Question>{
        val questions = ArrayList<Question>()

        val que1 =Question(
            1,"which country this flag belongs to?",
            R.drawable.ic_flag_of_argentina,
            "Argantina","Kuweit","Iran","Brazil",
            1
        )
        questions.add(que1)

        val que2 =Question(
            2,"which country this flag belongs to?",
            R.drawable.ic_flag_of_kuwait,
            "Canada","Kuweit","India","Australia",
            2
        )
        questions.add(que2)

        val que3 =Question(
            3,"which country this flag belongs to?",
            R.drawable.ic_flag_of_india,
            "india","Iraq","Pakistan","Brazil",
            1
        )
        questions.add(que3)

        val que4 =Question(
            4,"which country this flag belongs to?",
            R.drawable.ic_flag_of_germany,
            "Germany","Kuweit","Iraq","Belgium",
            1
        )
        questions.add(que4)

        val que5 =Question(
            5,"which country this flag belongs to?",
            R.drawable.ic_flag_of_fiji,
            "japon","fiji","Biritain","Argantina",
            2
        )
        questions.add(que5)

        val que6 =Question(
            6,"which country this flag belongs to?",
            R.drawable.ic_flag_of_denmark,
            "Argantina","denmark","Iran","Chiley",
            2
        )
        questions.add(que6)

        val que7 =Question(
            7,"which country this flag belongs to?",
            R.drawable.ic_flag_of_brazil,
            "Uk","Russia","Turkey","Brazil",
            4
        )
        questions.add(que7)

        val que8 =Question(
            8,"which country this flag belongs to?",
            R.drawable.ic_flag_of_australia,
            "Argantina","Afghanestan","australia","Iraq",
            3
        )
        questions.add(que8)

        val que9 =Question(
            9,"which country this flag belongs to?",
            R.drawable.ic_flag_of_belgium,
            "Argantina","Belgium","Germany","Brazil",
            2
        )
        questions.add(que9)

        val que10 =Question(
            10,"which country this flag belongs to?",
            R.drawable.ic_flag_of_new_zealand,
            "new Zealand","Austrialia","India","Japon",
            1
        )
        questions.add(que10)

        return questions
    }



}