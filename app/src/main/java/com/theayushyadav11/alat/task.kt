package com.theayushyadav11.alat

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.material.button.MaterialButton

class task : AppCompatActivity() {

    private lateinit var editTextTaskName: EditText
    private lateinit var editTextTaskDescription: EditText
    private lateinit var editTextTaskDate: EditText
    private lateinit var buttonSaveTask: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        var btn = findViewById<EditText>(R.id.editTextTaskName)

        btn.setOnClickListener {
            Toast.makeText(this, "edit name!!", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, taskedit::class.java)
            startActivity(intent)

            var btn = findViewById<EditText>(R.id.editTextTaskDescription)

            btn.setOnClickListener {
                Toast.makeText(this, "edit description!!", Toast.LENGTH_SHORT).show()
                var intent = Intent(this, taskedit::class.java)
                startActivity(intent)


                var btn = findViewById<EditText>(R.id.editTextTaskDate)

                btn.setOnClickListener {
                    Toast.makeText(this, "edit date!!", Toast.LENGTH_SHORT).show()
                    var intent = Intent(this, taskedit::class.java)
                    startActivity(intent)


                    var btn = findViewById<MaterialButton>(R.id.buttonSaveTask)

                    btn.setOnClickListener {
                        Toast.makeText(this, "save task!!", Toast.LENGTH_SHORT).show()
                        var intent = Intent(this, taskedit::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
    }
}