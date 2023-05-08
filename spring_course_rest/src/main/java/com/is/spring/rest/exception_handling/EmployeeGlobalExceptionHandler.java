package com.is.spring.rest.exception_handling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class EmployeeGlobalExceptionHandler {

  //Реагирует если объекта нет в БД
  @ExceptionHandler
  public ResponseEntity<EmployeeIncorrectData> handleException (NoSuchEmployeeException exception) {
    EmployeeIncorrectData data = new EmployeeIncorrectData();
    data.setInfo(exception.getMessage());
    return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
  }

  //Регирует на все остальные исключения
  @ExceptionHandler
  public ResponseEntity<EmployeeIncorrectData> handleException (Exception exception) {
    EmployeeIncorrectData data = new EmployeeIncorrectData();
    data.setInfo(exception.getMessage());
    return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
  }

}
