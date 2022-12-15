package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.common.Constants
import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidateFirstName {

    fun execute(firstName:  String): ValidationResultModel {
        return if (firstName.isEmpty()){
            ValidationResultModel(
                success = false,
                errorMessage = "The firstName can't empty"
            )
        }else if(firstName.length<3){
            ValidationResultModel(
                success = false,
                errorMessage = "The firstName needs to consist of at least 3 characters"
            )
        } else {
            ValidationResultModel(
                success = true
            )
        }
    }
}