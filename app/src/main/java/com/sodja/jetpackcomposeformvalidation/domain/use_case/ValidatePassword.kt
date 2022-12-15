package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.common.Constants
import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidatePassword {

    fun execute(password: String): ValidationResultModel {
        return if (password.length<6){
            ValidationResultModel(
                success = false,
                errorMessage = "The password needs to consist of at least 6 characters"
            )
        }else if(!Regex(Constants.PATTERN_PASSWORD).matches(password)){
            ValidationResultModel(
                success = false,
                errorMessage = "The password needs to contain at least capitalize letter, lower letter, number and digit"
            )
        } else {
            ValidationResultModel(
                success = true
            )
        }
    }
}