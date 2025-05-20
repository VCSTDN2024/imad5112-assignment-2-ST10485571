package vcmsa.ci.bmwquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Initialize UI elements from the layout using their IDs
        val welcomeText = findViewById<TextView>(R.id.textView)
        val appDescription = findViewById<TextView>(R.id.textView2)
        val startButton = findViewById<Button>(R.id.button)
        val exitButton = findViewById<Button>(R.id.button2)

        //Set text for the welcome text and app description
        welcomeText.text = "WELCOME TO THE QUIZ!"
        appDescription.text = "WELCOME TO THE BMW TRUE OR FALSE QUIZ! TEST YOUR KNOWLEDGE ON ONE OF THE WORLD'S MOST ICONIC AUTOMOTIVE BRANDS. LET'S SEE HOW MUCH YOU REALLY KNOW ABOUT BMW'S HISTORY, INNOVATION, AND LEGACY."

        //Set click listener for the start button
        startButton.setOnClickListener(){
            //When the start button is clicked, create an intent to navigate to the BmwActivity
            val intent = Intent(this, BmwActivity::class.java)  //Start the BmwActivity
            startActivity(intent)
            //
        }
        //Set click listener for the exit button
        exitButton.setOnClickListener(){
            //Close the current activity or quiz when button is clicked
            finish()
        }
    }
}