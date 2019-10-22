package com.example.intentreva

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val bundle = intent.extras
        val nim1 = bundle?.get("nim")
        val nama1 = bundle?.get("nama")
        val nilai1 = bundle?.get("nilai")
        val Keterangan = bundle?.get("Keterangan")
        NIM.text=nim1.toString()
        NAMA.text=nama1.toString()
        NILAI.text=nilai1.toString()
        KETERANGAN.text=Keterangan.toString()
    }
}
