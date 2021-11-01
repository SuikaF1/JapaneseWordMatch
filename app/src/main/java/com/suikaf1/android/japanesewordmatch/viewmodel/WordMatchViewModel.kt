package com.suikaf1.android.japanesewordmatch.viewmodel

import android.app.Application
import android.widget.Toast
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.suikaf1.android.japanesewordmatch.data.NUMBER_OF_WORDS
import com.suikaf1.android.japanesewordmatch.data.wordList
import com.suikaf1.android.japanesewordmatch.data.wordsListRes


class WordMatchViewModel(application: Application) : AndroidViewModel(application)
{
    private val _score = MutableLiveData(0)
    val score: LiveData<Int> get() = _score

    private val _half = MutableLiveData<String>()
    val half: LiveData<String> get() = _half

    private val _word = MutableLiveData<String>()
    val word: LiveData<String> get() = _word

    init {
        getNextWord()
    }

    private var wordListIndex: Int = 0

    fun updateScore() {
        _score.value = _score.value?.plus(2)
    }
    fun getNextWord() {
        if(this.wordListIndex < NUMBER_OF_WORDS) {
            _word.value = wordList[wordListIndex]
            this.wordListIndex++
        } else {
            Toast.makeText(getApplication(), "hi", Toast.LENGTH_SHORT)
        }
        _half.value = getApplication<Application>().getString(wordsListRes[wordListIndex])
    }
}