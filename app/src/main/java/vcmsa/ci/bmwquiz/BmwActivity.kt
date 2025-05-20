package vcmsa.ci.bmwquiz

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class BmwActivity : AppCompatActivity() {


    //Declare Ui variables for the activity
    private lateinit var btnNext: Button
    private lateinit var btnTrue: Button
    private lateinit var btnFalse: Button
    private lateinit var questionTextView: TextView
    private lateinit var answerTextView: TextView


    //Companion objects to hold the questions, answers, and current question index related to the quiz logic
    companion object {
        //Arrays of questions and answers for the quiz
        private val questions = arrayOf(
            "BMW was founded in 1913 as a manufacturer of aircraft engines?",
            "The BMW 328 was a motorcycle model produced in the 1930s? ",
            "BMW's first car model was the BMW 501, introduced in 1951?",
            "BMW acquired Mini in 1994?",
            "The blue and white in the BMW logo represents a spinning propeller, referencing the company's aircraft engin heritage?",
            "BMW started producing motorcycles in the 1920s?",
            "The BMW 3 series was introduced in the 1970s?",
            "BMW acquired Rolls-Rollyce Motor Cars in 1998?",
            "The BMW M1 was a high-performance sports car introduced in 1970s?",
            "BMW headquarters have always been located in Munich,Germany?",
        )

        //Boolean array to represent the correct answers(true/false) for each question
        private val answers = booleanArrayOf(true, false, true, true, true, true, true, true, true, true)
        private var currentQuestionIndex = 0   //Index to keep track of the current question being displayed
        private var score = 0   //Score to keep track of the user's correct answers
        private lateinit var feedback: String   //String to hold the feedback message for the user's answer
    }



        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            enableEdgeToEdge()
            setContentView(R.layout.activity_bmw)


            //Initialize UI elements from the layout
            btnNext = findViewById(R.id.button3)
            btnTrue = findViewById(R.id.button4)
            btnFalse = findViewById(R.id.button5)
            questionTextView = findViewById(R.id.textView3)
            answerTextView = findViewById(R.id.textView4)

            //Function to load the next question from the questions array
            fun loadQuestion() {
                if (currentQuestionIndex < questions.size) {   //Check if there are more questions to load
                    questionTextView.text = questions[currentQuestionIndex]
                    answerTextView.text = ""   //Clear the answer text view
                }
            }

            //Function to check the user's answer and update the UI accordingly
            fun checkAnswer(userAnswer: Boolean) {  //Check if the currentQuestionIndex is within the bounds of the array
                if (userAnswer == answers[currentQuestionIndex]) {
                    feedback = "Correct!"
                    answerTextView.setTextColor(Color.GREEN)
                    score++
                } else {   //If the answer is incorrect, display the correct answer
                    feedback = "Incorrect!"
                    answerTextView.setTextColor(Color.RED)
                }

                answerTextView.text = feedback
            }

            //Set click listeners for the true button
            btnTrue.setOnClickListener() {
                checkAnswer(true)
            }
            //Set click listeners for the false button
            btnFalse.setOnClickListener() {
                checkAnswer(false)
            }

            //Set click listener for the next button
            btnNext.setOnClickListener() {
                currentQuestionIndex++   //Move to the next question
                if (currentQuestionIndex < questions.size) {   //Check if there are more questions to load
                    loadQuestion()  //Load the next question
                } else {  //All questions answered, navigate to the (MainActivity3) score screen
                    val intent = Intent(this, MainActivity3::class.java)  //Pass the score, questions, and answers to the next activity
                    intent.putExtra("score", score)
                    intent.putExtra("questions", questions)
                    intent.putExtra("answers", answers)
                    startActivity(intent)
                    finish()
                }


            }
            //Load the first question when the activity is created
            loadQuestion()

        }
    }
