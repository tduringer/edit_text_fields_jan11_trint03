package com.example.edit_text_fields_jan11_trint03.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.edit_text_fields_jan11_trint03.databinding.ActivityMainBinding

const val F_NAME_EXTRA = "F_NAME_EXTRA"
const val L_NAME_EXTRA = "L_NAME_EXTRA"
const val EMAIL_EXTRA = "EMAIL_EXTRA"

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
//    private var fName = ""
//    private var lName = ""
//    private var email = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            val fName = fNameEt.text
            val lName = lNameEt.text
            val email = emailEt.text

            submitBtn.setOnClickListener{
                val intent = Intent(this@MainActivity, DisplayActivity::class.java)
                intent.putExtra(F_NAME_EXTRA, fName)
                intent.putExtra(L_NAME_EXTRA, lName)
                intent.putExtra(EMAIL_EXTRA, email )
                startActivity(intent)
            }
        }
    }
}