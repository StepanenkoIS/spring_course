package aop.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {

  @Pointcut("execution(* getBook())")
  public void allGetMethods(){}

  @Pointcut("execution(* addT*(..))")
  public void allAddMethods(){}
}
