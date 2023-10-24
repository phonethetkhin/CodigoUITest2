package com.ptk.codigouitest.viewmodel

import androidx.lifecycle.ViewModel
import com.ptk.codigouitest.ui.ui_states.HomeUIStates
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class HomeViewModel : ViewModel() {
    private val _uiStates = MutableStateFlow(HomeUIStates())
    val uiStates = _uiStates.asStateFlow()

    fun toggleDetailDialog(isShowDetailDialog: Boolean) {
        _uiStates.update { it.copy(isShowDetailDialog = isShowDetailDialog) }
    }
}