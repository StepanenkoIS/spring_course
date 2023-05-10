package com.is.spring.springboot.spring_data_jpa.service;




import com.is.spring.springboot.spring_data_jpa.entity.Employee;

import java.util.List;

public interface EmployeeService {

  public List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);

  List<Employee> findAllByName(String name);
}
