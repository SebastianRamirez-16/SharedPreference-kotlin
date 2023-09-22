package com.example.sharedpreference

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import com.example.sharedpreference.UserVipApplication.Companion.prefs

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
        checkUserValues()
    }

    fun checkUserValues(){
        if (prefs.getName().isNotEmpty()){
            goToDetail()
        }
    }

    fun initUI() {
        val btnContinue = findViewById<Button>(R.id.btnContinue)
        btnContinue.setOnClickListener{accessToDetail()}
    }

    private fun accessToDetail() {
        val etName = findViewById<EditText>(R.id.etName)
        val cbVIP = findViewById<CheckBox>(R.id.cbVip)
        if (etName.text.toString().isNotEmpty()) {
            prefs.saveName(etName.text.toString())
            prefs.saveVIP(cbVIP.isChecked)
            goToDetail()
        }else{
        }
    }

    fun goToDetail(){
      startActivity(Intent(this,ResultActivity::class.java))
    }


}