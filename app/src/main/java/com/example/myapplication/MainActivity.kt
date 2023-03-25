package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class MainActivity : AppCompatActivity() {

    private lateinit var name: TextView
    private lateinit var work: TextView
    private lateinit var bio: TextView
    private lateinit var skillName: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        name = findViewById(R.id.name)
        work = findViewById(R.id.work)
        bio = findViewById(R.id.bio)
        skillName = findViewById(R.id.skillName)

        val nameT = intent.getStringExtra("name")
        val workT = intent.getStringExtra("work")
        val bioT = intent.getStringExtra("about")
        val skillsT = intent.getStringExtra("skillsIn")

        name.text = nameT
        work.text = workT
        bio.text = bioT
        skillName.text = skillsT
//        dateText.setText("year: "+year+"month: "+monthOfYear+"date: "+dayOfMonth)

    }

    fun linkedIn(view: View) {
        try {

            view.findViewById<Button>(R.id.linkedin)
            val url = "https://www.linkedin.com/in/harshit-bisht-abb842251"
            val linkedInT = intent.getStringExtra("linkedIn")
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(linkedInT)
            startActivity(i)
        }
        catch (e :Exception){
            Toast.makeText(this, "link not provided", Toast.LENGTH_SHORT).show()
        }
    }
    fun gitHub(view: View) {
        try {

            view.findViewById<Button>(R.id.github)
//            val url = "https://github.com/"
            val githubT = intent.getStringExtra("github")
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse("https://github.com/$githubT")
            startActivity(i)
        }
        catch (e :Exception){
            Toast.makeText(this, "link not provided", Toast.LENGTH_SHORT).show()
        }
    }
    fun gMail(view: View) {
        try {
            val gmailT = intent.getStringExtra("gmail")
            val i = Intent(Intent.ACTION_VIEW, Uri.parse("mailto:$gmailT"))
            startActivity(i)
        }
        catch (e :Exception){
            Toast.makeText(this, "link not provided", Toast.LENGTH_SHORT).show()
        }
    }
    fun instagram(view: View) {
        try {

            view.findViewById<Button>(R.id.instagram)
            val instagramT = intent.getStringExtra("instagram")
            val url = "https://instagram.com/$instagramT?igshid=YmMyMTA2M2Y="
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        catch (e :Exception){
            Toast.makeText(this, "link not provided", Toast.LENGTH_SHORT).show()
        }
    }
    fun whatsApp(view: View) {
        try {

            view.findViewById<Button>(R.id.whatsapp)
            val whatsappT = intent.getStringExtra("whatsapp")
            val url = "https://api.whatsapp.com/send?phone=$whatsappT"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(url)
            startActivity(i)
        }
        catch (e :Exception){
            Toast.makeText(this, "link not provided", Toast.LENGTH_SHORT).show()
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when(item.itemId){
            R.id.edit -> {
                Toast.makeText(this,"edited",Toast.LENGTH_LONG).show()
            }
            R.id.search -> {
                Toast.makeText(this,"searched",Toast.LENGTH_LONG).show()
            }
            R.id.help -> {
                Toast.makeText(this,"help opening",Toast.LENGTH_LONG).show()
            }
            R.id.share -> {
                Toast.makeText(this,"sharing",Toast.LENGTH_LONG).show()
            }
        }
        return super.onOptionsItemSelected(item)
    }

    fun editAll(item: MenuItem)
    {
        val intent1 = Intent(this, MainActivity2::class.java)
        startActivity(intent1)
    }
}