package com.example.bnav.ui.log

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class LogViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profile page"
    }
    val text: LiveData<String> = _text
}