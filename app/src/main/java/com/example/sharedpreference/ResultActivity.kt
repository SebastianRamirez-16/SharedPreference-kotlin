package com.example.sharedpreference

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.sharedpreference.UserVipApplication.Companion.prefs

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        initUI()
    }

    fun initUI(){
        val btnBack = findViewById<Button>(R.id.btnBack)
        val tvName = findViewById<TextView>(R.id.tvName)
        val username = prefs.getName()
        btnBack.setOnClickListener{
            prefs.wipe()
            onBackPressed()
        }
        tvName.text = "BIENVENIDO $username"

    }




}