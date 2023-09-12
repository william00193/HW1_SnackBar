package com.example.hw1withsnackbar

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hw1withsnackbar.databinding.ActivityMainBinding
import com.example.hw2Exercise1.question
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //Defining both buttons as a 'button' and naming
    //private lateinit var trueButton: Button
    //private lateinit var falseButton: Button

    //creating a variable for the binding
    private lateinit var binding : ActivityMainBinding


    private val questionBank = listOf(
        question(R.string.question_australia, true),
        question(R.string.question_oceans, true),
        question(R.string.question_mideast, false),
        question(R.string.question_africa, false),
        question(R.string.question_americas, true),
        question(R.string.question_asia, true),
    )

private var currentIndex = 0




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)

        //Naming and finding both of the buttons
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        //trueButton = findViewById(R.id.true_button)
       // falseButton = findViewById(R.id.false_button)



        //My on onclick listener for the true button
        // and coding it with 'Correct!'
        binding.trueButton.setOnClickListener {

            val snackBar = Snackbar.make (
                it,
                "Correct!",
                Snackbar.LENGTH_LONG

            )


            //Changing the color of the snack bar and text
            snackBar.setTextColor(Color.BLACK)
            snackBar.setBackgroundTint(Color.GREEN)
            snackBar.show()
        }



        //My on onclick listener for the false button
        // and coding it with 'False!'
        binding.falseButton.setOnClickListener {

            val snackBar = Snackbar.make (
                it,
                "False!",
                Snackbar.LENGTH_LONG

            )

            //Changing the color of the snack bar and text
            snackBar.setTextColor(Color.BLACK)
            snackBar.setBackgroundTint(Color.RED)
            snackBar.show()
        }

        binding.nextButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % questionBank.size
//            val questionTextResId = questionBank[currentIndex].textResId
//            binding.questionTextView.setText(questionTextResId)
                updateQuestion()
        }

updateQuestion()

    }

    private fun updateQuestion() {
        val questionTextResId = questionBank[currentIndex].textResId
        binding.questionTextView.setText(questionTextResId)
    }
}