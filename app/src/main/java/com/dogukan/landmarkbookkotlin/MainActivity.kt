package com.dogukan.landmarkbookkotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.dogukan.landmarkbookkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var landmarkList : ArrayList<Landmark>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        landmarkList = ArrayList<Landmark>()

        //Data
        val erciyes = Landmark("Erciyes","Turkey/Kayseri",R.drawable.erciyes)
        val collesium = Landmark("Collesium","Italy/Rome",R.drawable.collesium)
        val machuPicchu = Landmark("Machu Picchu","Peru/Cusco",R.drawable.machupicchu)
        val eiffel = Landmark("Eiffel Tower","France/Paris",R.drawable.eiffel)

        landmarkList.add(erciyes)
        landmarkList.add(collesium)
        landmarkList.add(machuPicchu)
        landmarkList.add(eiffel)

        //adapter object
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landmarkAdapter  = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landmarkAdapter


    }
}