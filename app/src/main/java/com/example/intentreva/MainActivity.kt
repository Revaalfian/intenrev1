package com.example.intentreva

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        proses.setOnClickListener {
            intent = Intent(this, Main2Activity::class.java)
            intent.putExtra("nim", NIM.text)
            intent.putExtra("nama", NAMA.text)
            intent.putExtra("nilai", NILAI.text)
            if (NILAI.text.toString().toInt()>=80) {
                intent.putExtra("Keterangan", "A")
            }
            else if (NILAI.text.toString().toInt()>=60) {
                intent.putExtra("Keterangan", "B")
            }
            else if (NILAI.text.toString().toInt()>=40) {
                intent.putExtra("Keterangan", "C")
            }
            else if (NILAI.text.toString().toInt()>=20) {
                intent.putExtra("Keterangan", "D")
            }
            else if (NILAI.text.toString().toInt()>=0) {
                intent.putExtra("Keterangan", "E")
            }
            startActivity(intent)
        }
    }
}
