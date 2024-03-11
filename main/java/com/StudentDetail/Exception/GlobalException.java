package com.StudentDetail.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=NumberException.class)
	public ResponseEntity<Object>post(NumberException n){
		return new ResponseEntity<>(n.getMessage(),HttpStatus.BAD_GATEWAY);
	}

}
