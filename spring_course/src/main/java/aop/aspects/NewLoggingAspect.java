package aop.aspects;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {


  @Around("execution(String returnBook())")
  public Object aroundReturnBookAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
    System.out.println("aroundReturnBookAdvice: в библиотеку пытаются вернуть книгу");

    long begin = System.currentTimeMillis();
    //Запускам  метод
    Object targetMethodResult = proceedingJoinPoint.proceed();
    //Изменение результата
    targetMethodResult = "Война и мир";
    long end = System.currentTimeMillis();

    System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");

    System.out.println("Время работы метода aroundReturnBookAdvice: " + (end - begin) + " мс");

    return targetMethodResult;
  }
}
