package com.example.androidtestinglibrariy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.androidtestinglibrariy.databinding.ActivityMainBinding
import com.example.calculation.Calculation

class MainActivity : AppCompatActivity() {
    lateinit var activityMainBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        Toast.makeText(this, "${Calculation.plus(10,20)}", Toast.LENGTH_SHORT).show()
    }
}