package com.example.regformapptesting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    //Create variables and specify the type to hold our different views
    private lateinit var userName: EditText
    private lateinit var mail: EditText
    private lateinit var phoneNumber: EditText
    private lateinit var submit: Button
    private lateinit var gender: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        //Instantiate the Functions class to access the class methods in this activity
        val function: ValidationFunctions = ValidationFunctions()

        //Assign a value to variables bu using the find by view method
        userName = findViewById(R.id.userName)
        mail = findViewById(R.id.eMail)
        phoneNumber = findViewById(R.id.pNumber)
        submit = findViewById(R.id.buttonReg)
        gender = findViewById(R.id.genderDropDown)

        //store the input values in a variable on click of the button
        submit.setOnClickListener {
            val fullName: String = userName.text.toString()
            val eMail = eMail.text.toString().trim()
            val mobile = phoneNumber.text.toString().trim()
            val sex = gender.getSelectedItem().toString()

            //Pass the input value stored to new activity
            if (function.validateDetails(fullName, eMail, mobile, sex)) {
                startActivity(Intent(this, UserDetails::class.java).also {
                    it.putExtra("Extra_name", fullName)
                    it.putExtra("Extra_phone_number", mobile)
                    it.putExtra("Extra_mail", eMail)
                    it.putExtra("Extra_gender", sex)
                })
                //Implement transition to new activity
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)

                //Display error message using toast
            } else {
                Toast.makeText(this, function.errorMsg, Toast.LENGTH_SHORT).show()
            }
        }

        //Start login activity on button click
        btnLogRegister.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left)
        }
    }
    override fun onBackPressed() {
        super.onBackPressed()
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right)
    }
}


