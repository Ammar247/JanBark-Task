package com.example.myapplication.viewmodel

import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.myapplication.repository.TranslateRepo
import kotlinx.coroutines.launch
import java.util.*

class TranslateViewModel(private val repo: TranslateRepo) : ViewModel() {
    private val _currentContent = MutableLiveData<String>()

    val currentContent: LiveData<String>
        get() = _currentContent

    public fun translate(text: String, sourceLanguage: String, targetLanguage: String) {

        viewModelScope.launch {
            repo.translate(text, sourceLanguage, targetLanguage) {
                _currentContent.postValue(it)
            }
        }
    }

    class Factory(private val repo: TranslateRepo) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            return TranslateViewModel(repo) as T
        }
    }
}
