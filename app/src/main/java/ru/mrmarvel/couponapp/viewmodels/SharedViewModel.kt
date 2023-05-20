package ru.mrmarvel.couponapp.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

class SharedViewModel : ViewModel() {
    var title: MutableState<String> = mutableStateOf("")
}