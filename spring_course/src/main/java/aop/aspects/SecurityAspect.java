package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {


  @Before("aop.aspects.MyPointcuts.allGetMethods()")
  public void beforeGetSecurityAdvice() {
    System.out.println("beforeGetSecurityAdvice(): проверка прав на получение книги или журнала ");
    System.out.println("-----------------><-----------------");
  }

  @Before("aop.aspects.MyPointcuts.allAddMethods()")
  public void beforeAddSecurityAdvice() {
    System.out.println("beforeAddSecurityAdvice(): проверка прав на добавление книги");
    System.out.println("-----------------><-----------------");
  }

}
