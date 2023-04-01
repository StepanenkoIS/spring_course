package aop.aspects;


import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

  @Before("aop.aspects.MyPointcuts.allGetMethods()")
  public void beforeGetLoggingAdvice() {
    System.out.println("beforeGetLoggingAdvice(): логирование попытки получить книгу или журнал");
    System.out.println("-----------------><-----------------");
  }

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
    MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
    System.out.println("methodSignature = " + methodSignature);
    System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
    System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
    System.out.println("methodSignature.getName() = " + methodSignature.getName());
    System.out.println("methodSignature.getDeclaringTypeName() = " + methodSignature.getDeclaringTypeName());


    if ("addBook".equals(methodSignature.getName())) {
        Object [] arg = joinPoint.getArgs();
      for (Object obj: arg) {
        if (obj instanceof Book) {
          Book book = (Book) obj;
          System.out.println("Информация о книге -> Название '" + book.getName() +
            "', автор '" + book.getAuthor() +
            "', год публикации '" + book.getYearPublication() + "'");
        } else if (obj instanceof String) {
          System.out.println("книгу в библиотеку добавляет " + obj);
        }
      }
    }
    System.out.println("beforeAddLoggingAdvice(): логирование попытки добавить книгу");
    System.out.println("-----------------><-----------------");
  }

}
