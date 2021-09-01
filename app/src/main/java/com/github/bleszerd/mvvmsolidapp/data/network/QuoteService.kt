package com.github.bleszerd.mvvmsolidapp.data.network

import com.github.bleszerd.mvvmsolidapp.core.RetrofitHelper
import com.github.bleszerd.mvvmsolidapp.data.model.QuoteModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.create

class QuoteService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getQuotes(): List<QuoteModel> {
        return withContext(Dispatchers.IO){
            val response = retrofit.create(QuoteApiClient::class.java).getAllNotes()
            response.body() ?: emptyList()
        }
    }
}