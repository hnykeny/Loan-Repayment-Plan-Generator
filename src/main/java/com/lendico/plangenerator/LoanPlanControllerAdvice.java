package com.lendico.plangenerator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class LoanPlanControllerAdvice {

	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<Object> handleNotFoundException(BadRequestException ex) {
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}
