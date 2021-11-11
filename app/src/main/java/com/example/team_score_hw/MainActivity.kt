package com.example.team_score_hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.team_score_hw.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // do view binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //2
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //object
         val viewModel = ViewModelProvider(this).get(calculatorViewModel::class.java)

        // display
        binding.button.setOnClickListener{
            // fun add one point
          viewModel.addPoint()
          binding.textView.text = viewModel.number.toString()
    }
        binding.button2.setOnClickListener{
            // fun subtract 2 points
          viewModel.subtractPoints()
          binding.textView.text = viewModel.number.toString()
    }
        binding.button3.setOnClickListener{
            // fun add 4 points
            viewModel.addFourPoints()
            binding.textView.text = viewModel.number.toString()
    }
}
}