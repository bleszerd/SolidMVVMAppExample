package com.github.bleszerd.mvvmsolidapp.domain

import com.github.bleszerd.mvvmsolidapp.data.QuoteRepository
import com.github.bleszerd.mvvmsolidapp.data.model.QuoteModel

class GetQuotesUseCase {
    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}