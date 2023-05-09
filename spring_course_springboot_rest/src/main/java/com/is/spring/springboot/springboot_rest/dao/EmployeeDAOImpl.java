package com.is.spring.springboot.springboot_rest.dao;

import com.is.spring.springboot.springboot_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

  @Autowired
  private EntityManager entityManager;


  public List<Employee> getAllEmployees() {

//    Session session = entityManager.unwrap(Session.class);
//    Query<Employee> query = session.createQuery("from Employee", Employee.class);
//    List<Employee> employeeList = query.getResultList();

    Query query = entityManager.createQuery("from Employee");
    List<Employee> employeeList = query.getResultList();
    return employeeList;
  }

  @Override
  public void saveEmployee(Employee employee) {
//    Session session = entityManager.unwrap(Session.class);
//    //if (id == 0) save else update
//    session.saveOrUpdate(employee);

    Employee newEmployee = entityManager.merge(employee);
    employee.setId(newEmployee.getId());

  }

  @Override
  public Employee getEmployee(int id) {
//    Session session = entityManager.unwrap(Session.class);
//    Employee employee = session.get(Employee.class, id);
//    return employee;

    Employee employee = entityManager.find(Employee.class, id);
    return employee;
  }

  @Override
  public void deleteEmployee(int id) {
//    Session session = entityManager.unwrap(Session.class);
//    Query<Employee> query = session.createQuery("delete  from Employee where id = :employeeId");
//    query.setParameter("employeeId", id);
//    query.executeUpdate();

    Query query = entityManager.createQuery("delete  from Employee where id = :employeeId");
    query.setParameter("employeeId", id);
    query.executeUpdate();
  }
}
