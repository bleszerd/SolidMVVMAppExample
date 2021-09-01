package com.github.bleszerd.mvvmsolidapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.github.bleszerd.mvvmsolidapp.model.QuoteModel
import com.github.bleszerd.mvvmsolidapp.model.QuoteProvider

class QuoteViewModel : ViewModel(){
    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }
}