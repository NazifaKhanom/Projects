package android.example.androidlistview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    private lateinit var buttonView_1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView() // Initializing all view

        buttonView_1.setOnClickListener{
            val intent = Intent (this, ListView_One:: class.java)
            startActivity(intent)
        }



    }

    private fun initView(){
        buttonView_1 = findViewById(R.id.buttonView_1)

    }
}