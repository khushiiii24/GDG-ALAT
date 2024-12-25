package com.theayushyadav11.alat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class taskedit : AppCompatActivity() {

    private lateinit var textViewTaskName: TextView
    private lateinit var textViewTaskDescription: TextView
    private lateinit var textViewTaskDate: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.edit_task)

        val btn = findViewById<TextView>(R.id.textViewTaskName)

        btn.setOnClickListener {
            Toast.makeText(this, "get started!!", Toast.LENGTH_SHORT).show()


            var btn = findViewById<TextView>(R.id.textViewDescription)

            btn.setOnClickListener {
                Toast.makeText(this, "get started!!", Toast.LENGTH_SHORT).show()

                var btn = findViewById<TextView>(R.id.textViewDueDate)

                btn.setOnClickListener {
                    Toast.makeText(this, "get started!!", Toast.LENGTH_SHORT).show()


                    var btn = findViewById<TextView>(R.id.textViewPriority)

                    btn.setOnClickListener {
                        Toast.makeText(this, "get started!!", Toast.LENGTH_SHORT).show()

                    }
                }
            }
        }

    }
}
