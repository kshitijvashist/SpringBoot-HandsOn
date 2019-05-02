package com.kshitij.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.kshitij.exception.RecordNotFoundException;

@ControllerAdvice
public class RecordExceptionController {
	@ExceptionHandler(value = RecordNotFoundException.class)
	   public ResponseEntity<Object> exception(RecordNotFoundException exception) {
	      return new ResponseEntity<>(exception.getMessage(), HttpStatus.NOT_FOUND);
	}

}
