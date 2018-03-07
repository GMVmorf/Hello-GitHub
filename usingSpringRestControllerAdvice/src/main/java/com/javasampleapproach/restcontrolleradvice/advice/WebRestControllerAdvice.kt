package com.javasampleapproach.restcontrolleradvice.advice

import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice

import com.javasampleapproach.restcontrolleradvice.exception.CustomNotFoundException
import com.javasampleapproach.restcontrolleradvice.model.ResponseMsg

@RestControllerAdvice
class WebRestControllerAdvice {

    @ExceptionHandler(CustomNotFoundException::class)
    fun handleNotFoundException(ex: CustomNotFoundException) = ResponseMsg(ex.message + " Hello, this is adviser!!!")
}