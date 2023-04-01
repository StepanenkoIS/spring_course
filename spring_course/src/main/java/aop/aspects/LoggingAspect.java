package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class LoggingAspect {


  @Before("execution(public * getBook(aop.Book))")
  public void beforeGetBookAdvice() {
    System.out.println("beforeGetBookAdvice(): попытка получить книгу");
  }

  @Before("execution(public void get*())")
  public void beforeGetAdvice() {
    System.out.println("beforeGetAdvice(): попытка вызова метода get*()");
  }


  @Before("execution(public * returnBook())")
  public void beforeReturnBookAdvice() {
    System.out.println("beforeReturnBookAdvice(): попытка вернуть книгу");
  }

  @Before("execution(* *(*))")
  public void beforeForAllAdvice() {
    System.out.println("beforeForAllAdvice(): для всех методов с одним параметром");
  }

  @Before("execution(* *(..))")
  public void beforeForAllAdvice2() {
    System.out.println("beforeForAllAdvice2(): для всех методов с любым кол-вом параметров");
  }

}
