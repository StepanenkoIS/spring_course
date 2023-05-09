package com.is.spring.security.controller;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Controller
public class MyController {


  @GetMapping("/")
  public String getInfoForAllEmpls() {
    return "view_for_all_employees";
  }

  @GetMapping("/hr_info")
  public String getInfoOnlyForHR() {
    return "view_for_hr";
  }

  @GetMapping("/manager_info")
  public String getInfoOnlyForManagers() {
    return "view_for_managers";
  }

}
