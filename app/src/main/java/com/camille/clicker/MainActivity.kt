package com.camille.clicker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.databinding.DataBindingUtil
import com.camille.clicker.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.viewModel = ViewModel()
        findViewById<Button>(R.id.button).apply { this.setOnClickListener {
            Log.i("TAG", binding.editText.text.toString())
            binding.viewModel?.update(binding.editText.text.toString())
        } }
    }
}