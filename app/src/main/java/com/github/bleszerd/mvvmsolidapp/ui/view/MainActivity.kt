package com.github.bleszerd.mvvmsolidapp.ui.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.isVisible
import com.github.bleszerd.mvvmsolidapp.databinding.ActivityMainBinding
import com.github.bleszerd.mvvmsolidapp.ui.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel = QuoteViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.onCreate()

        quoteViewModel.quoteModel.observe(this, { quote ->
            binding.textViewQuote.text = quote.quote
            binding.textViewAuthor.text = quote.author
        })

        quoteViewModel.isLoading.observe(this, { isLoading ->
            binding.progressBarProgress.isVisible = isLoading
        })

        binding.root.setOnClickListener {
            quoteViewModel.randomQuote()
        }
    }
}