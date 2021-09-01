package com.github.bleszerd.mvvmsolidapp.domain

import com.github.bleszerd.mvvmsolidapp.data.QuoteRepository
import com.github.bleszerd.mvvmsolidapp.data.model.QuoteModel
import com.github.bleszerd.mvvmsolidapp.data.model.QuoteProvider

class GetRandomQuoteUseCase {
    private val repository = QuoteRepository()

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes

        if (!quotes.isNullOrEmpty()) {
            val randomNumber = (quotes.indices).random()
            return quotes[randomNumber]
        }

        return null
    }
}