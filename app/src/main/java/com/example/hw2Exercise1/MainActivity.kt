package com.example.hw2Exercise1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.hw1withsnackbar.R
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    //Defining both buttons as a 'button' and naming
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Naming and finding both of the buttons
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)



        //My on onclick listener for the true button
        // and coding it with 'Correct!'
        trueButton.setOnClickListener {

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
        falseButton.setOnClickListener {

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

    }
}