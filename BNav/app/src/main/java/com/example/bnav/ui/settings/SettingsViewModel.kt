package com.example.bnav.ui.settings

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class SettingsViewModel : ViewModel(){

    private val _text = MutableLiveData<String>().apply {
        value = "This is settings page"
    }
    val text: LiveData<String> = _text
}