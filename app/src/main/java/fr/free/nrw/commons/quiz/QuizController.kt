package fr.free.nrw.commons.quiz

import android.content.Context

import java.util.ArrayList

import fr.free.nrw.commons.R


/**
 * Controls the quiz in the Activity
 */
class QuizController {

    private val quiz: ArrayList<QuizQuestion> = ArrayList()

    companion object{

        const val urlForSelfie = "https://i.imgur.com/0fMYcpM.jpg"
        const val urlForTajMahal = "https://upload.wikimedia.org/wikipedia/commons/1/15/Taj_Mahal-03.jpg"
        const val urlForBlurryImage = "https://i.imgur.com/Kepb5jR.jpg"
        const val urlForScreenshot = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8b/Social_media_app_mockup_screenshot.svg/500px-Social_media_app_mockup_screenshot.svg.png"
        const val urlForEvent = "https://upload.wikimedia.org/wikipedia/commons/5/51/HouseBuildingInNorthernVietnam.jpg"
    }


    fun initialize(context: Context) {
        val q1 = QuizQuestion(
            1,
            context.getString(R.string.quiz_question_string),
            urlForSelfie,
            false,
            context.getString(R.string.selfie_answer)
        )
        quiz.add(q1)

        val q2 = QuizQuestion(
            2,
            context.getString(R.string.quiz_question_string),
            urlForTajMahal,
            true,
            context.getString(R.string.taj_mahal_answer)
        )
        quiz.add(q2)

        val q3 = QuizQuestion(
            3,
            context.getString(R.string.quiz_question_string),
            urlForBlurryImage,
            false,
            context.getString(R.string.blurry_image_answer)
        )
        quiz.add(q3)

        val q4 = QuizQuestion(
            4,
            context.getString(R.string.quiz_screenshot_question),
            urlForScreenshot,
            false,
            context.getString(R.string.screenshot_answer)
        )
        quiz.add(q4)

        val q5 = QuizQuestion(
            5,
            context.getString(R.string.quiz_question_string),
            urlForEvent,
            true,
            context.getString(R.string.construction_event_answer)
        )
        quiz.add(q5)
    }

    fun getQuiz(): ArrayList<QuizQuestion> {
        return quiz
    }
}



