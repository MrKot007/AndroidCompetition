package com.example.androidcompetition

data class ModelAuth (val email: String, val password: String)
data class ModelAns(val codeResponse: ModelCodeResponse, val b)
data class ModelCodeResponse(val code: Int)
