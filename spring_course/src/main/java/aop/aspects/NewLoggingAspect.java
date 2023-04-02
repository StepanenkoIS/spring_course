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

    Object targetMethodResult = null;
    try {
      //Запускам  метод
      targetMethodResult = proceedingJoinPoint.proceed();
    } catch (Exception exception) {
      System.out.println("Было поймано исключение: " + exception);
      // Изменение результата
//      targetMethodResult = "неизвестное название книги";
      throw exception;
    }

    System.out.println("aroundReturnBookAdvice: в библиотеку успешно вернули книгу");


    return targetMethodResult;
  }
}
