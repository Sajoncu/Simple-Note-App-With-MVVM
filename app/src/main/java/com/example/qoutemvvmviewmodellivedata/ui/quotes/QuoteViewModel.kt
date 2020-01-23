package com.example.qoutemvvmviewmodellivedata.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.qoutemvvmviewmodellivedata.data.Quote
import com.example.qoutemvvmviewmodellivedata.data.QuoteRepository

class QuoteViewModel (private val qouteRepository: QuoteRepository) : ViewModel(){

    fun getQuote() = qouteRepository.getQuotes()
    fun addQuote(quote: Quote) = qouteRepository.addQuote(quote)

}