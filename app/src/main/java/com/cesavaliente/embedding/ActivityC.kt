package com.cesavaliente.embedding

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.cesavaliente.embedding.databinding.EmbeddedActivityCBinding

class ActivityC : AppCompatActivity() {
    private lateinit var binding: EmbeddedActivityCBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = EmbeddedActivityCBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.launchActivityD.setOnClickListener {
            val intent = Intent(this, ActivityD::class.java)
            startActivity(intent)
        }
    }
}