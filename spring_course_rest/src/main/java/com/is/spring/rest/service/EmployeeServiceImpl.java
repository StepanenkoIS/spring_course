package com.is.spring.rest.service;


import com.is.spring.rest.dao.EmployeeDAO;
import com.is.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;



@Service
public class EmployeeServiceImpl implements EmployeeService {

  @Autowired
  private EmployeeDAO employeeDAO;

  @Override
  @Transactional
  public List<Employee> getAllEmployees() {
    return employeeDAO.getAllEmployees();
  }

  @Override
  @Transactional
  public void saveEmployee(Employee employee) {
    employeeDAO.saveEmployee(employee);
  }

  @Override
  @Transactional
  public Employee getEmployee(int id) {
    Employee employee = employeeDAO.getEmployee(id);
    return employee;
  }

  @Override
  @Transactional
  public void deleteEmployee(int id) {
    employeeDAO.deleteEmployee(id);
  }
}
