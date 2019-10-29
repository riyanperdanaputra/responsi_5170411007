package com.example.responsi_5170411007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class Activity_register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val namaid = findViewById<EditText>(R.id.namaid)
        val nimid = findViewById<EditText>(R.id.nimid)
        val prodiid = findViewById<EditText>(R.id.prodiid)
        val fakultasid = findViewById<EditText>(R.id.fakultasid)

        val btn_daftar = findViewById<Button>(R.id.btn_daftar)

        btn_daftar.setOnClickListener {
            val nama = namaid.text.toString()
            val nim = nimid.text.toString()
            val prodi = prodiid.text.toString()
            val fakultas = fakultasid.text.toString()

            val intent = Intent(this@Activity_register,Activity_proses::class.java)

            intent.putExtra("NAMA", nama)
            intent.putExtra("NIM", nim)
            intent.putExtra("PRODI", prodi)
            intent.putExtra("FAKULTAS", fakultas)

            startActivity(intent)
        }


    }
}

