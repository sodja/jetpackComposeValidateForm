package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidateUsername {

    fun execute(username:  String): ValidationResultModel {
        return if (username.isEmpty()){
            ValidationResultModel(
                success = false,
                errorMessage = "The username can't empty"
            )
        }else if(username.length<6){
            ValidationResultModel(
                success = false,
                errorMessage = "The username needs to consist of at least 6 characters"
            )
        } else {
            ValidationResultModel(
                success = true
            )
        }
    }

}