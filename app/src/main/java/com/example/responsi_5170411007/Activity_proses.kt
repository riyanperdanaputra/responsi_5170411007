package com.example.responsi_5170411007

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class Activity_proses : AppCompatActivity() {

    lateinit var hasilnya:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_proses)

        var intent=intent

        val nama =intent.getStringExtra("NAMA")
        val nim =intent.getStringExtra("NIM")
        val prodi =intent.getStringExtra("PRODI")
        val fakultas =intent.getStringExtra("FAKULTAS")

        val result =findViewById<TextView>(R.id.result)

        result.text="NAMA : "+nama+"\nNIM : "+nim+"\nPRODI : "+prodi+"\nFAKULTAS : "+fakultas+"\nKETERANGAN : Merupakan Mahasiswa TI Angkatan 2017"

    }
}

