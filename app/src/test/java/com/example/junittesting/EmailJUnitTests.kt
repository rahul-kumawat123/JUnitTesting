package com.example.junittesting

import org.junit.Assert
import org.junit.Test

class EmailJUnitTests {

    @Test
    fun emailShouldContainEmailSymbol(){
        val emailAddress = "rahulkumawatgmail.com"
        val emailIsCorrect = isValidEmail(emailAddress)
        Assert.assertTrue(emailIsCorrect)
    }

    @Test
    fun emailShouldNotContainSpaces(){
        val emailAddress = "rahul kumawat@gmail.com"
        val emailIsCorrect = isValidEmail(emailAddress)
        Assert.assertTrue(emailIsCorrect)
    }

    @Test
    fun emailShouldNotStartWithUnderScore(){
        val emailAddress = "rahulkumawat@gmail.com"
        val emailIsCorrect = isValidEmail(emailAddress)
        Assert.assertTrue(emailIsCorrect)
    }

    @Test
    fun emailShouldNotContainDashInBetween(){
        val emailAddress = "rahul-kumawatgmail.com"
        val emailIsCorrect = isValidEmail(emailAddress)
        Assert.assertTrue(emailIsCorrect)
    }

    @Test
    fun emailShouldContainCorrectDomain(){
        val emailAddress = "rahulk@gmail.com"
        val emailIsCorrect = isValidEmail(emailAddress)
        Assert.assertTrue(emailIsCorrect)
    }
}