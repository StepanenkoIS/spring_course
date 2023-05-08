package com.is.spring.rest.service;


import com.is.spring.rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

  public List<Employee> getAllEmployees();

  void saveEmployee(Employee employee);

  Employee getEmployee(int id);

  void deleteEmployee(int id);
}
