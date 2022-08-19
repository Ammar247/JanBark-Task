package com.example.myapplication.viewmodel

import androidx.lifecycle.*
import androidx.lifecycle.viewmodel.CreationExtras
import com.example.myapplication.repository.WordRepo
import kotlinx.coroutines.launch
import java.util.*

class WordViewModel(private val wordRepo: WordRepo) : ViewModel() {
    private val _currentContent = MutableLiveData<ArrayList<String>>()

    val currentContent: LiveData<ArrayList<String>>
        get() = _currentContent

    init {
        getWordlist()
    }

    private fun getWordlist() {

        viewModelScope.launch {
            wordRepo.getWordlist {
                _currentContent.postValue(it)
            }
        }
    }

    class Factory(private val repo: WordRepo) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
            return WordViewModel(repo) as T
        }
    }
}