package com.plcoding.core.util

sealed class UiEvent {
    data class Navigate(val route: String): UiEvent()
    object NavigateU : UiEvent()
    data class ShowSnackBar(val message: UiText): UiEvent()
}