package com.is.spring.rest;

import com.is.spring.rest.configuration.MyConfig;
import com.is.spring.rest.entity.Employee;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication", Communication.class);
        List<Employee> employeeList = communication.getAllEmployees();
        System.out.println(employeeList);
        System.out.println("-----<>-----");
        Employee employeeByID = communication.getEmployee(1);
        System.out.println(employeeByID);
        System.out.println("-----<>-----");
//        Employee employee = new Employee("Buba", "Ivanov", "HR", 1000);
        Employee employee = new Employee("Buba", "Ivanov", "IT", 2000);
        employee.setId(16);
        communication.saveEmployee(employee);
        System.out.println("-----<>-----");
        communication.deleteEmployee(16);

    }
}
