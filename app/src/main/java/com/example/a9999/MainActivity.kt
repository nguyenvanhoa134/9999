package com.example.a9999

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)







        val edt_inputlink = findViewById<EditText>(R.id.editTextText_inputlink)
        val button_inputlink = findViewById<Button>(R.id.button)
        button_inputlink.setOnClickListener {
            val link = edt_inputlink.text
            if (isValidUrl(link.toString())) {
                val yes= Toast.makeText(this, "Đã nhập đúng link", Toast.LENGTH_SHORT).show()
            }
            else{
                val no= Toast.makeText(this, "Đã nhập sai link, mời xem danh sach link đc phép" +
                        " truyện", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
private fun isValidUrl(url: String): Boolean {
    val pattern = Patterns.WEB_URL
    return pattern.matcher(url).matches()
}
