package com.is.spring.springboot.springboot_rest.dao;

import com.is.spring.springboot.springboot_rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  @Autowired
  private EntityManager entityManager;


  public List<Employee> getAllEmployees() {

    Session session = entityManager.unwrap(Session.class);
    Query<Employee> query = session.createQuery("from Employee", Employee.class);
    List<Employee> employeeList = query.getResultList();

    return employeeList;
  }
//
//  @Override
//  public void saveEmployee(Employee employee) {
//    Session session = sessionFactory.getCurrentSession();
//    //if (id == 0) save else update
//    session.saveOrUpdate(employee);
//  }
//
//  @Override
//  public Employee getEmployee(int id) {
//    Session session = sessionFactory.getCurrentSession();
//    Employee employee = session.get(Employee.class, id);
//    return employee;
//  }
//
//  @Override
//  public void deleteEmployee(int id) {
//    Session session = sessionFactory.getCurrentSession();
//    Query<Employee> query = session.createQuery("delete  from Employee where id = :employeeId");
//    query.setParameter("employeeId", id);
//    query.executeUpdate();
//  }
}
