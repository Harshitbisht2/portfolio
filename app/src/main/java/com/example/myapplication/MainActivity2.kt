package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {

    private lateinit var name: EditText
    private lateinit var work: EditText
    private lateinit var about: EditText
    private lateinit var inSkills: EditText
    private lateinit var inLinkedIn: EditText
    private lateinit var inGithub: EditText
    private lateinit var inGmail: EditText
    private lateinit var inInstagram: EditText
    private lateinit var inWhatsapp: EditText
    private lateinit var save: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        name = findViewById(R.id.editName)
        work = findViewById(R.id.editWork)
        about = findViewById(R.id.editAbout)
        inSkills = findViewById(R.id.editSkills)
        inLinkedIn = findViewById(R.id.editLinkedIn)
        inGithub = findViewById(R.id.editGithub)
        inGmail = findViewById(R.id.editmail)
        inInstagram = findViewById(R.id.editInstagram)
        inWhatsapp = findViewById(R.id.editWhatsapp)
        save = findViewById(R.id.saveButton)

        save.setOnClickListener{
            startActivity(Intent(this,MainActivity::class.java)
                .putExtra("name",name.text.toString())
                .putExtra("work",work.text.toString())
                .putExtra("about",about.text.toString())
                .putExtra("skillsIn",inSkills.text.toString())
                .putExtra("linkedIn",inLinkedIn.text.toString())
                .putExtra("github",inGithub.text.toString())
                .putExtra("gmail",inGmail.text.toString())
                .putExtra("instagram",inInstagram.text.toString())
                .putExtra("whatsapp",inWhatsapp.text.toString()))


        }
    }
}