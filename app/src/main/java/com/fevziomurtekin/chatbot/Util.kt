package com.fevziomurtekin.chatbot

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager.HIDE_NOT_ALWAYS
import android.content.Context.INPUT_METHOD_SERVICE
import android.support.v4.content.ContextCompat.getSystemService
import android.view.View
import android.view.inputmethod.InputMethodManager


object Util{
    fun hideKeyboard(context: Activity, view: View) {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(view.getWindowToken(), InputMethodManager.HIDE_NOT_ALWAYS)
    }

    fun hideKeyboard(context: Activity) {
        try {
            hideKeyboard(context, context.currentFocus!!)
        } catch (e: Exception) { }
    }
}