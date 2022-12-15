package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.common.Constants
import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidateRepeatPassword {

    fun execute(password: String, repeatPassword: String): ValidationResultModel {
        return if(repeatPassword != password){
            ValidationResultModel(
                success = false,
                errorMessage = "The password don't match"
            )
        } else {
            ValidationResultModel(
                success = true
            )
        }
    }
}