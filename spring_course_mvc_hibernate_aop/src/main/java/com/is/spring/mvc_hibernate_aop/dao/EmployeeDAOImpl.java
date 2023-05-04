package com.is.spring.mvc_hibernate_aop.dao;

import com.is.spring.mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  @Autowired
  private SessionFactory sessionFactory;


  public List<Employee> getAllEmployees() {

    Session session = sessionFactory.getCurrentSession();
//    List<Employee> employeeList = session.createQuery("from Employee", Employee.class).getResultList();
    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    List<Employee> employeeList = query.getResultList();

    return employeeList;
  }
}
