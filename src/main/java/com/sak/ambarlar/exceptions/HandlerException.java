package com.sak.ambarlar.exceptions;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class HandlerException extends ResponseEntityExceptionHandler {
	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleAnyException(Exception ex, WebRequest request) {

		String errorMessageDesc = ex.getLocalizedMessage();
		if (errorMessageDesc == null)
			errorMessageDesc = ex.toString();
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), errorMessageDesc,ex.toString());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@ExceptionHandler(value = { NullPointerException.class, UserServiceRunTimeException.class })
	public ResponseEntity<Object> handleCustomException(Exception ex, WebRequest request) {

		String errorMessageDesc = ex.getLocalizedMessage();
		if (errorMessageDesc == null)
			errorMessageDesc = ex.toString();
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), errorMessageDesc,ex.toString());
		return new ResponseEntity<Object>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
