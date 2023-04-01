package aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

  @Before("aop.aspects.MyPointcuts.allGetMethods()")
  public void beforeGetExceptionHandlingAdvice() {
    System.out.println("beforeGetExceptionHandlingAdvice(): обработка исключений при попытке получить книгу/журнал");
    System.out.println("-----------------><-----------------");
  }

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddExceptionHandlingAdvice() {
    System.out.println("beforeAddExceptionHandlingAdvice(): обработка исключений при попытке добавить книгу");
    System.out.println("-----------------><-----------------");
  }

}
