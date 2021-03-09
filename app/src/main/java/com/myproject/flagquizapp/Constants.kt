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

        val que6 = Question(
            6, questionText,
            R.drawable.ic_flag_of_new_zealand, "New Zealand", "South Africa", "Australia",
            "Philippines", 1
        )
        questionsList.add(que6)

        val que7 = Question(
            7, questionText,
            R.drawable.ic_flag_of_germany, "Belgium", "Italy", "Spain",
            "Germany", 4
        )
        questionsList.add(que7)

        val que8 = Question(
            8, questionText,
            R.drawable.ic_flag_of_fiji, "Thailand", "Galapagos", "Fiji",
            "Bermuda", 3
        )
        questionsList.add(que8)

        val que9 = Question(
            9, questionText,
            R.drawable.ic_flag_of_brazil, "Bolivia", "Brazil", "Colombia",
            "Canada", 1
        )
        questionsList.add(que9)

        val que10 = Question(
            10, questionText,
            R.drawable.ic_flag_of_australia, "New Zealand", "Tasmania", "Australia",
            "USA", 1
        )
        questionsList.add(que10)

        return questionsList

    }
}