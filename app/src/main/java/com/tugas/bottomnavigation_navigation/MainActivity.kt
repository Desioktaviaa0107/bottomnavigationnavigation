package com.tugas.bottomnavigation_navigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.setupActionBarWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.tugas.bottomnavigation_navigation.databinding.ActivityMainBinding
import androidx.navigation.ui.NavigationUI.setupWithNavController as setupWithNavController1

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController=Navigation.findNavController(this,R.id.activity_main_nav_host_fragment)
        setupWithNavController1(navController,binding.bottomNavigationView)


    }

    private fun setupWithNavController1(navController: NavController, bottomNavigationView: BottomNavigationView?) {

    }


}





