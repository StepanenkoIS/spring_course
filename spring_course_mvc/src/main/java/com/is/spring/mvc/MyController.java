package com.is.spring.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

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

//  @RequestMapping(path = "/showDetails", method = RequestMethod.GET)
  @PostMapping("/showDetails")
  public String showEmployeeDetails(@Valid @ModelAttribute("employee") Employee employee,
                                    BindingResult bindingResult) {

    if (bindingResult.hasErrors())
      return "ask-emp-details-view";
    else
      return "show-emp-details-view";

  }
}
