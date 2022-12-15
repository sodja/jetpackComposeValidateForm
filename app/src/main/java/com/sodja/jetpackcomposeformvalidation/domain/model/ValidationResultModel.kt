package com.sodja.jetpackcomposeformvalidation.domain.model

data class ValidationResultModel(
    val success: Boolean,
    val errorMessage: String? = null,
)
