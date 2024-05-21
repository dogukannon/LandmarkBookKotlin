package com.dogukan.landmarkbookkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.dogukan.landmarkbookkotlin.databinding.ActivityDetalilsBinding
import com.dogukan.landmarkbookkotlin.databinding.ActivityMainBinding

class DetalilsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetalilsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetalilsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //intent function
        val intent =intent

        //casting variable as landmark object
        val selectedLandmark =intent.getSerializableExtra("landmark") as Landmark

        binding.nameText.text = selectedLandmark.name
        binding.countryText.text = selectedLandmark.country
        binding.imageView.setImageResource(selectedLandmark.image)
    }
}