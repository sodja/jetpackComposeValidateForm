package com.sodja.jetpackcomposeformvalidation.presentation

data class RegistrationFormState(
    val username: String= "",
    val usernameError: String? = null,
    val password: String= "",
    val passwordError: String? = null,
    val repeatPassword: String= "",
    val repeatPasswordError: String? = null,
    val email: String= "",
    val emailError: String? = null,
    val firstName: String= "",
    val firstNameError: String? = null,
    val lastName: String= "",
    val lastNameError: String? = null,
    )
