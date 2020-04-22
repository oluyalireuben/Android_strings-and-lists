package com.king.myuiandlistapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        mListPple.setOnItemClickListener { parent, view, position, id ->
            var item = parent.getItemAtPosition(position).toString()

            Toast.makeText(this,"$item clicked",Toast.LENGTH_LONG).show()
        }
    }
}
