package com.example.qoutemvvmviewmodellivedata.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.qoutemvvmviewmodellivedata.data.QuoteRepository

class QuoteViewModelFractory(private val quoteRepository: QuoteRepository) : ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuoteViewModel(quoteRepository) as T
    }
}