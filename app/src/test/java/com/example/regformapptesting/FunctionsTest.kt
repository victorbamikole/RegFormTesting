package com.example.regformapptesting

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class FunctionsTest{

    private lateinit var function: Functions

    @Before
    fun setup(){
        function = Functions()
    }

    @Test
    fun validateNameTest(){
        val name = function.validateName(" ")
        assertEquals(false, name)
//        assertTrue("Aron Abel", true)

    }

    @Test
    fun validateMailTest(){
        val name = function.validateMail("victor@gmail.com")
        assertEquals(true, name)

    }

    @Test
    fun validateNumberTest(){
        val name = function.validatePhoneNumber("09033017453")
        assertEquals(true, name)

    }

    @Test
    fun validateDetailsTest(){
        val name = function.validateDetails("Aron Abel", "aron@gmail.com", "08033216784")
        assertEquals(false, name)

    }

}