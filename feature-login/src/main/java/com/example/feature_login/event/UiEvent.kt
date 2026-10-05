package com.example.feature_login.event

sealed interface LoginUiEvent {
    data object NavigateToDashboard : LoginUiEvent
}