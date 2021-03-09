package com.myproject.flagquizapp

object Constants {

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val questionText = "What country does this flag belong to?"
        val que1 = Question(
            1, questionText,
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia",
            "Austria", 1
        )
        questionsList.add(que1)

        val que2 = Question(
            2, questionText,
            R.drawable.ic_flag_of_belgium, "Bahamas", "Belgium", "Barbados",
            "Belize", 2
        )
        questionsList.add(que1)

        val que3 = Question(
            3, questionText,
            R.drawable.ic_flag_of_india, "Russia", "France", "Denmark",
            "India", 4
        )
        questionsList.add(que3)

        val que4 = Question(
            4, questionText,
            R.drawable.ic_flag_of_denmark, "Germany", "Chili", "Denmark",
            "Norway", 3
        )
        questionsList.add(que4)

        val que5 = Question(
            5, questionText,
            R.drawable.ic_flag_of_kuwait, "Iraq", "Thailand", "Kuwait",
            "Gabon", 3
        )
        questionsList.add(que5)

        val que1 = Question(
            1, questionText,
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia",
            "Austria", 1
        )
        questionsList.add(que1)

        val que1 = Question(
            1, questionText,
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia",
            "Austria", 1
        )
        questionsList.add(que1)

        val que1 = Question(
            1, questionText,
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia",
            "Austria", 1
        )
        questionsList.add(que1)

        val que1 = Question(
            1, questionText,
            R.drawable.ic_flag_of_argentina, "Argentina", "Australia", "Armenia",
            "Austria", 1
        )
        questionsList.add(que1)

        return questionsList

    }
}