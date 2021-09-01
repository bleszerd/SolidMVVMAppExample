package com.github.bleszerd.mvvmsolidapp.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.bleszerd.mvvmsolidapp.databinding.ActivityMainBinding
import com.github.bleszerd.mvvmsolidapp.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel = QuoteViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.root.setOnClickListener {
            quoteViewModel.randomQuote()
        }

        quoteViewModel.quoteModel.observe(this, { quote ->
            binding.textViewQuote.text = quote.quote
            binding.textViewAuthor.text = quote.author
        })

        setContentView(binding.root)
    }
}