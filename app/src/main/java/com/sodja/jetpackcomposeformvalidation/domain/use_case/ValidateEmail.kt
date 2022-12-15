package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.R
import com.sodja.jetpackcomposeformvalidation.common.Constants.PATTERN_PASSWORD
import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidateEmail {

    fun execute(password: String): ValidationResultModel{
        return if (password.length<6){
            ValidationResultModel(
                success = false,
                errorMessage = "The password needs to consist of at least 6 characters"
            )
        }else if(!Regex(PATTERN_PASSWORD).matches(password)){
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