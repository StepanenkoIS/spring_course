package com.is.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/employee")
public class MyController {


  @RequestMapping("/")
  public String showFirstView() {
    return "first-view";
  }


  @RequestMapping("/askDetails")
  public String askEmployeeDetails(Model model) {
//    Проставить данные по умолчанию
//    Employee employee = new Employee();
//    employee.setName("Alex");
//    employee.setSurname("Alexeev");
//    employee.setSalary(800);
//    model.addAttribute("employee", employee);

    model.addAttribute("employee", new Employee());
    return "ask-emp-details-view";
  }

  @RequestMapping("/showDetails")
  public String showEmployeeDetails(@ModelAttribute("employee") Employee employee) {

    String name = employee.getName();
    employee.setName("Mr. " + name);

    String surname = employee.getSurname();
    employee.setSurname(surname + " !!!!!");

    int salary = employee.getSalary();
    employee.setSalary(salary * 10);

    return "show-emp-details-view";
  }
}
