package com.example.junittesting

/**
 *
 * Requirements to check:
 * 1) Email should contain @
 * 2) Email should not be blank
 * 3) Email should not start with _ (Underscore)
 * 4) Email should not contain dashes (-) in between letters
 * 5) Email should contain .com domain
 */

fun isValidEmail(email : String): Boolean{
    if(!email.contains("@"))
        return false
    else if (email.contains(" "))
        return false
    else if (email.startsWith("_"))
        return false
    else if (email.contains("-"))
        return false
    else if (!email.contains(".com"))
        return false
    return true
}