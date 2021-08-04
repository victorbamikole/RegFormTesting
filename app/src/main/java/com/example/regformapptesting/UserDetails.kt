package com.example.regformapptesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class UserDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_details)

        val profile: TextView = findViewById(R.id.greetings)
        val pNumber: TextView = findViewById(R.id.textView5)
        val userName: TextView = findViewById(R.id.textView4)
        val eMail: TextView = findViewById(R.id.textView6)
        val gender: TextView = findViewById(R.id.textView7)


        val name = intent.getStringExtra("Extra_name")
        val phoneNumber = intent.getStringExtra("Extra_phone_number")
        val mail = intent.getStringExtra("Extra_mail")
        val sex = intent.getStringExtra("Extra_gender")


        profile.text = "Hello $name "
        pNumber.text = phoneNumber
        userName.text = name
        eMail.text = mail
        gender.text = sex

    }
}