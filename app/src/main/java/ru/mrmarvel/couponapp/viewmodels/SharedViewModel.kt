package ru.mrmarvel.couponapp.viewmodels

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch

class SharedViewModel : ViewModel() {
    fun getSelectedCouponCategory(couponCategoryId: Int) {
        viewModelScope.launch {
            // repository.getSelectedTask(taskId = taskId).collect { task ->
            //     _selectedTask.value = task
            // }
        }
    }

    var title: MutableState<String> = mutableStateOf("")
}