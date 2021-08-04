package com.example.regformapptesting

class Functions {

    //Declare variables for different conditions

    var errorMsg: String = ""
    private var result: Boolean = false

    //Name validation function

    fun validateName(fullName: String): Boolean {
        val nameDetails = Regex("[A-Z][a-zA-Z]{2,}(?: [A-Z][a-zA-Z]*){0,2}")
        if (fullName.isEmpty()) {
            errorMsg = "Full Name Required"
            result = false
        } else if (!fullName.contains(" ")) {
            errorMsg = "Full Name Required"
            result = false
        } else {
            result = true
        }
        return result
    }

    //Email validation function

    fun validateMail(mail: String): Boolean {
        val mailAddress = Regex("[a-zA-Z0-9._*]+@[a-z]+\\.+[a-z]+")
        if (mail.isEmpty()) {
            errorMsg = "Enter valid Mail"
            result = false
        } else if (!mailAddress.matches(mail)) {
            errorMsg = "Mail Incorrect"
            result = false
        } else {
            result = true
        }
        return result
    }

    //Phone number validation function

    fun validatePhoneNumber(pNumber: String): Boolean {
        val validNumber = Regex("(234|0)[0-9]{10}")
        if (pNumber.isEmpty()) {
            errorMsg = "Enter valid Number"
            result = false
        } else if (!pNumber.matches(validNumber)) {
            errorMsg = "Enter valid Number"
            result = false
        } else {
            result = true
        }
        return result
    }

    //Gender validation

    fun validateGender(sex: String): Boolean {
        errorMsg = "Select your gender"
        return sex == "Male" || sex == "Female"
    }

    //Registration Validation function

    fun validateDetails(fullName: String, mail: String, pNumber: String, gender: String): Boolean {
        result = validateName(fullName) && validateMail(mail) && validatePhoneNumber(pNumber) && validateGender(gender)
        return result
    }
}
