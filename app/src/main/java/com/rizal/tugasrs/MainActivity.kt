package com.rizal.tugasrs

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //splass screen
        //handle untuk delay semlama beberpa detik
        Handler(Looper.getMainLooper()).postDelayed(
            {
                //ini setelaha delay akan pindah ke page berikutnya secara otomotais
                val intent =Intent(this,StarterPageActivity::class.java)
                startActivity(intent)
                finish() //agar ketika sudah pindah page berikutnya,ini pagenya gak back
            },3000
        )

        //Task:
        //splash screen
        //page start screen --> klik button get started ini pindah ke logis
        //pada page logim, ketika klik tulisan sign up --> ini pindah page sign up
        //pada page sigup ,ketika klik login---. pindah ke login

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}