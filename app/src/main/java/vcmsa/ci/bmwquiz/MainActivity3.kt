package vcmsa.ci.bmwquiz

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        //Initialize UI elements from the layout
        val scoreTextView = findViewById<TextView>(R.id.textView5)
        val btnExit = findViewById<Button>(R.id.button7)
        val btnReview = findViewById<Button>(R.id.button8)
        val feedbackTextView = findViewById<TextView>(R.id.textView6)

        //Retrieve data passed from the previous activity (likely the bmw activity screen)
        val score = intent.getIntExtra("score", 0)
        val questions = intent.getStringArrayExtra("questions")
        val answers = intent.getBooleanArrayExtra("answers")

        //Determine feedback message based on the score
        val feedback = if (score >= 5) {
            "Great Job!"
        } else  {
            "Keep Practicing!"
        }


        //Display the score and initial feedback
        scoreTextView.text = "Your score: $score/10\n$feedback"
        //Initially, the feedback also shows the general feedback
        //This will be updated when the user clicks the "Review" button
        feedbackTextView.text = feedback

        //Set click listener for the "Review" button
        btnReview.setOnClickListener() {
            var review = ""   // String builder for the review text
            // Check if questions and answers arrays are not null before accessing their elements
            if (questions != null && answers != null) {  //Iterate through the questions and answers to build the review string
                for (i in questions.indices) {
                    review += "${i + 1}. ${questions[i]} - Answer: ${if (answers[i]) {  //Check if the answer is true or false
                        "True"
                    } else "False"}\n"
                }
                feedbackTextView.text = review  //Display the detailed review in the feedbackTextView
            }
            btnExit.setOnClickListener() {   //Exit the app when the "Exit" button is clicked
                finishAffinity()
            }
        }
        }
    }
