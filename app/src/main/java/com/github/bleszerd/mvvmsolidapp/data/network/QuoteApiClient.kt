package com.github.bleszerd.mvvmsolidapp.data.network

import com.github.bleszerd.mvvmsolidapp.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("b/612fdeb197616340d2df499e/1")
    suspend fun getAllNotes() : Response<List<QuoteModel>>
}