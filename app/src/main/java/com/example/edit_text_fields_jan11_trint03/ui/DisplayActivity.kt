package com.example.edit_text_fields_jan11_trint03.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.edit_text_fields_jan11_trint03.databinding.ActivityDisplayBinding

class DisplayActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDisplayBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDisplayBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fName = intent.extras?.get(F_NAME_EXTRA) ?: "No First Name Input"
        val lName = intent.extras?.get(L_NAME_EXTRA) ?: "No Last Name Input"
        val email = intent.extras?.get(EMAIL_EXTRA) ?: "No Email Input"

        binding.fNameTv.text =  fName.toString()
        binding.lNameTv.text =  lName.toString()
        binding.emailTv.text =  email.toString()

    }
}