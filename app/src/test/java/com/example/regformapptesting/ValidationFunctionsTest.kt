package com.example.regformapptesting

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class ValidationFunctionsTest {

    private lateinit var function: ValidationFunctions

    //Instantiate the validationFunctions class
    @Before
    fun setup() {
        function = ValidationFunctions()
    }

    //Test validName function with correct name
    @Test
    fun validateNameTest() {
        val name = function.validateName("Abel Aaron")
        assertEquals(true, name)
    }

    //Test validName function with wrong name
    @Test
    fun validateWrongNameTest() {
        val name = function.validateName("4may aron")
        assertEquals(false, name)
    }

    // Test validMail function with correct mail
    @Test
    fun validateMailTest() {
        val name = function.validateMail("_@gmail.......com")
        assertEquals(true, name)
    }

    //Test validMail function with incorrect mail
    @Test
    fun validateWrongMailTest() {
        val name = function.validateMail("victorgmail.com")
        assertEquals(false, name)
    }

    //Test validNumber function with correct number
    @Test
    fun validateNumberTest() {
        val name = function.validatePhoneNumber("09033017453")
        assertEquals(true, name)
    }

    //Test validNumber function with correct number
    @Test
    fun validateNumberTest234() {
        val name = function.validatePhoneNumber("2349033017453")
        assertEquals(true, name)
    }

    //Test validNumber function with correct number
    @Test
    fun validateWrongNumberTest() {
        val name = function.validatePhoneNumber("4033017453")
        assertEquals(false, name)
    }

    @Test

    //Test validGender function with correct gender selection
    fun validateGenderTest() {
        val name = function.validateGender("Male")
        assertEquals(true, name)
    }

    //Test validGender function with incorrect gender selection
    @Test
    fun validateInvalidGenderTest() {
        val name = function.validateGender("Select")
        assertEquals(false, name)
    }

    //Test validateDetails function with correct details
    @Test
    fun validateDetailsTest() {
        val name = function.validateDetails("Aron Abel", "aron@gmail.com", "08033216784", "Male")
        assertEquals(true, name)
    }

    //Test validateDetails function with incorrect details
    @Test
    fun validateWrongDetailsTest() {
        val name = function.validateDetails("Aron", "arongmailcom", "78033216784", "Select")
        assertEquals(false, name)

    }
}