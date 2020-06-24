package com.example.bnav.ui.log

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.support.v4.app.Fragment
import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import com.example.bnav.R

class LogFragment : Fragment() {

    private lateinit var logViewModel: LogViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        logViewModel =
                ViewModelProviders.of(this).get(LogViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_log, container, false)

        return root
    }
}