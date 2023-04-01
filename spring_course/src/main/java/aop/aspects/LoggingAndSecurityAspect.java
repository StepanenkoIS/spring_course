package aop.aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;



@Component
@Aspect
public class LoggingAndSecurityAspect {


  //Любой метод
  @Pointcut("execution(* aop.UniLibrary.*(..))")
  private void allMethodsFromUniLibrary(){}

//  //Только метод returnMagazine()
//  @Pointcut("execution(* aop.UniLibrary.returnMagazine())")
//  private void returnMagazineFromUniLibrary(){}
//
//  //Любой метод кроме returnMagazine()
//  @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//  private void allMethodsExceptMagazineFromUniLibrary(){}
//
//  @Before("allMethodsExceptMagazineFromUniLibrary()")
//  public void beforeAllMethodsExceptMagazineAdvice() {
//    System.out.println("beforeAllMethodsExceptMagazineAdvice(): writing Log #10");
//  }
//
//  @Pointcut("execution(* aop.UniLibrary.get*())")
//  private void allGetMethodsFromUniLibrary(){}
//
//  @Pointcut("execution(* aop.UniLibrary.return*())")
//  private void allReturnMethodsFromUniLibrary(){}
//
//  @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//  private void allGetAndReturnMethodsFromUniLibrary(){}
//
//  @Before("allGetMethodsFromUniLibrary()")
//  public void beforeGetLoggingAdvice() {
//    System.out.println("beforeGetLoggingAdvice(): writing Log #1");
//  }
//
//  @Before("allReturnMethodsFromUniLibrary()")
//  public void beforeReturnLoggingAdvice() {
//    System.out.println("beforeReturnLoggingAdvice(): writing Log #2");
//  }
//
//  @Before("allGetAndReturnMethodsFromUniLibrary()")
//  public void beforeGetAndReturnLoggingAdvice() {
//    System.out.println("beforeGetAndReturnLoggingAdvice(): writing Log #3");
//  }









}
