package com.theayushyadav11.alat

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.button.MaterialButton
import com.google.android.material.floatingactionbutton.FloatingActionButton

data class Task(val name: String, val description: String, val date: String)

class MainActivity : AppCompatActivity() {

    private val taskList = mutableListOf<Task>()
    private lateinit var recyclerViewTasks: RecyclerView
    private lateinit var fabAddTask: FloatingActionButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var btn = findViewById<MaterialButton>(R.id.btn_get_started)

        btn.setOnClickListener {
            Toast.makeText(this, "get started!!", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, task::class.java)
            startActivity(intent)

        }
    }
}
