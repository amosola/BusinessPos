package com.one0one.businesspos

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.one0one.businesspos.room.BusinessPosRepository

class BusinessPosViewModelFactory(private val repository: BusinessPosRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel> create(modelClass: Class<T>): T = BusinessPosViewModel(repository) as T
}