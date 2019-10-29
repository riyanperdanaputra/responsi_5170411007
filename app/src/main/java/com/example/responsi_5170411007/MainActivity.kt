package com.example.responsi_5170411007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user=findViewById<EditText>(R.id.user)
        val pass=findViewById<EditText>(R.id.pass)

        val btn_login=findViewById<Button>(R.id.btn_login)

        btn_login.setOnClickListener {
            val username=user.text.toString()
            val password=pass.text.toString()

            val intent= Intent(this@MainActivity,Activity_register::class.java)

            intent.putExtra("Username", username)
            intent.putExtra("Password", password)

            startActivity(intent)
        }

    }
}
