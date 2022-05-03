package com.plcoding.composepagingyt.domain.useCases

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class ValidatePasswordTest {

    private lateinit var validatePassword: ValidatePassword

    @Before
    fun setUp() {
        validatePassword = ValidatePassword()
    }

    @Test
    fun `Password is letter-only, returns error`(){
        val result = validatePassword.execute("abcdfegh")
        assertEquals(result.successful, false)
    }

}