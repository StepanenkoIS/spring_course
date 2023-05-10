package com.is.spring.springboot.spring_data_rest.dao;

import com.is.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

 /*
 GET    http://localhost:8080/springboot_rest/employees
 POST   http://localhost:8080/springboot_rest/employees -> body json
 PUT    http://localhost:8080/springboot_rest/employees/{id} -> body json
 GET    http://localhost:8080/springboot_rest/employees/search/findAllByName?name={name}
 */
  public List<Employee> findAllByName(String name);

}