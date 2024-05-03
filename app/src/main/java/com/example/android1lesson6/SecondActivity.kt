package com.example.android1lesson6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android1lesson6.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    private val adapter = AestheticsAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initialize()
        aestheticsList()
    }

    private fun initialize() = with(binding) {
        rvAesthetics.adapter = adapter
        adapter.setAppList(aestheticsList())
    }

    private fun aestheticsList() = listOf(
        AestheticsModels(R.drawable.aestetics1, "Erbol"),
        AestheticsModels(R.drawable.aestetics2, "Ibragim"),
        AestheticsModels(R.drawable.aestetics3, "Adil"),
        AestheticsModels(R.drawable.aestetics4, "Dancho"),
        AestheticsModels(R.drawable.aestetics1, "Ui"),
        AestheticsModels(R.drawable.aestetics2, "XXX"),
        AestheticsModels(R.drawable.aestetics3, "Arg"),
        )
}