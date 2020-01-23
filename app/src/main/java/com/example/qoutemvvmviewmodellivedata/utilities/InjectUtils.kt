package com.example.qoutemvvmviewmodellivedata.utilities

import com.example.qoutemvvmviewmodellivedata.data.FakeDatabase
import com.example.qoutemvvmviewmodellivedata.data.QuoteRepository
import com.example.qoutemvvmviewmodellivedata.ui.quotes.QuoteViewModelFractory

object InjectUtils {
    fun provideQuotesViewModelFactory(): QuoteViewModelFractory{
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuoteViewModelFractory(quoteRepository)
    }
}