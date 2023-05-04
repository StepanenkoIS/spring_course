package com.is.spring.mvc_hibernate_aop.entity;

import com.is.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.is.spring.mvc_hibernate_aop.service.EmployeeService;
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
}
