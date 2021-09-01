package com.github.bleszerd.mvvmsolidapp.data

import com.github.bleszerd.mvvmsolidapp.data.model.QuoteModel
import com.github.bleszerd.mvvmsolidapp.data.model.QuoteProvider
import com.github.bleszerd.mvvmsolidapp.data.network.QuoteService

class QuoteRepository {
    private val api = QuoteService()

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        QuoteProvider.quotes = response
        return response
    }
}