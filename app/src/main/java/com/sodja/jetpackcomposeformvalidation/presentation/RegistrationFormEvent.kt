package com.sodja.jetpackcomposeformvalidation.presentation

import com.sodja.jetpackcomposeformvalidation.domain.use_case.ValidateFirstName

sealed class RegistrationFormEvent {
    data class UsernameChanged(val username: String) : RegistrationFormEvent()
    data class FirstNameChanged(val firstName: String) : RegistrationFormEvent()
    data class LastNameChanged(val lastName: String) : RegistrationFormEvent()
    data class EmailChanged(val email: String) : RegistrationFormEvent()
    data class PasswordChanged(val password: String) : RegistrationFormEvent()
    data class RepeatedPasswordChanged(
        val repeatedPassword: String
    ) : RegistrationFormEvent()

    object Submit: RegistrationFormEvent()
}