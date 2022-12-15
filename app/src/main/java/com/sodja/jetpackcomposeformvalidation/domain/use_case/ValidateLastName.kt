package com.sodja.jetpackcomposeformvalidation.domain.use_case

import com.sodja.jetpackcomposeformvalidation.domain.model.ValidationResultModel

class ValidateLastName {
    fun execute(LastName:  String): ValidationResultModel {
        return if (LastName.isEmpty()){
            ValidationResultModel(
                success = false,
                errorMessage = "The LastName can't empty"
            )
        }else if(LastName.length<3){
            ValidationResultModel(
                success = false,
                errorMessage = "The LastName needs to consist of at least 3 characters"
            )
        } else {
            ValidationResultModel(
                success = true
            )
        }
    }
}