package com.example.healthproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        initListeners()
    }

    override fun onBackPressed() {
    }

    private fun initListeners() {
        generalHealthBt.setOnClickListener {
            startActivity(Intent(this, RealTimeHealthActivity::class.java))
        }
        emotionalHealthBt.setOnClickListener {
            startActivity(Intent(this, EmotionalHealthActivity::class.java))
        }
        physicalHealthBt.setOnClickListener {
            startActivity(Intent(this, PhysicalHealthActivity::class.java))
        }
        onlineAppointmentBt.setOnClickListener {
//            startActivity(Intent(this, OnlineAppointmentActivity::class.java))
        }
        alertsBt.setOnClickListener {
            startActivity(Intent(this, AlertActivity::class.java))
        }
    }
}