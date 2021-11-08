package com.example.perpustakaan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnIntent: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnIntent = findViewById(R.id.login)

        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.login -> run{
                var intentregister = Intent(this@MainActivity, Register::class.java)
                startActivity(intentregister)
            }
        }

        var cvdongeng: CardView = findViewById(R.id.dongeng)

        cvdongeng.setOnClickListener{
            var intent = Intent(this,Dongeng::class.java)
            startActivity(intent)
        }
    }
}