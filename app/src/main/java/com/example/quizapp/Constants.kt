package com.example.quizapp

import android.util.Log

object Constants {

    const val USER_NAME:String="user_name"
    const val TOTAL_QUESTIONS:String="total_question"
    const val CORRECT_ANSWER:String="correct_answers"



    fun getQuestions():ArrayList<Question>{
        val questionsList=ArrayList<Question>()

        val que1=Question(
            1,"What Country does this flag belong to? ",
            R.drawable.argentina_flag,
            "Argentina","Australia","Armenia","Austria",1
        )
        questionsList.add(que1)
        val que2=Question(
            2,"What Country does this flag belong to? ",
            R.drawable.australia_flag,
            "Argentina","Australia","Armenia","Austria",2
        )
        questionsList.add(que2)
        val que3=Question(
            3,"What Country does this flag belong to? ",
            R.drawable.brazil_flag,
            "Turkey","Brazil","Jordan","Sudan",2
        )
        questionsList.add(que3)
        val que4=Question(
            4,"What Country does this flag belong to? ",
            R.drawable.flag_denmark,
            "Turkey","Brazil","Denmark","Jordan",3
        )
        questionsList.add(que4)
        val que5=Question(
            5,"What Country does this flag belong to? ",
            R.drawable.flag_germany,
            "Palestine","Australia","France","Germany",4
        )
        questionsList.add(que5)
        Log.e("next ques",">>>>>>>>Added")
        val que6=Question(
            6,"What Country does this flag belong to? ",
            R.drawable.flag_of_india,
            "India","Pakistan","Afghanistan","Turkey",1
        )
        questionsList.add(que6)
        val que7=Question(
            7,"What Country does this flag belong to? ",
            R.drawable.pakistan_flag,
            "India","Pakistan","Armenia","Germany",2
        )
        questionsList.add(que7)
        val que8=Question(
            8,"What Country does this flag belong to? ",
            R.drawable.turkey_flag,
            "Pakistan","Sudan","Germany","Turkey",4
        )
        questionsList.add(que8)

        return questionsList
    }
}