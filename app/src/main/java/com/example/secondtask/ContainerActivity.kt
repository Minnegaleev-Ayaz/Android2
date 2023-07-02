package com.example.secondtask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class ContainerActivity : AppCompatActivity() {
    private var btnTP: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_container)
        btnTP=findViewById(R.id.btnTP)
        val controller = (supportFragmentManager.findFragmentById(R.id.container) as NavHostFragment)
            .navController
        findViewById<BottomNavigationView>(R.id.bnv_main).apply {
            setupWithNavController(controller)
            btnTP?.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_technicalFragment2)
            }
        }
    }
}