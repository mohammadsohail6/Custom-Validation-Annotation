package com.sohail.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.sohail.model.ErrorResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	protected @ResponseBody ErrorResponse resourceNotFoundExcepiton(
			MethodArgumentNotValidException resourceNotFoundExcepiton) {

		return new ErrorResponse(
				resourceNotFoundExcepiton.getMessage(),
				HttpStatus.BAD_REQUEST.name(), HttpStatus.BAD_REQUEST.value(), new Date());
	}
}
