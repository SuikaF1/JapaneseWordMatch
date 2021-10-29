package com.suikaf1.android.japanesewordmatch.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class WordMatchViewmodel : ViewModel()
{
    private val _score = MutableLiveData(2000)
    val score: LiveData<Int> = _score

    fun updateScore() {
        score.value?.inc()
    }
}