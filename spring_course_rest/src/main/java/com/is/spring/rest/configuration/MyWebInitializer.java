package com.is.spring.rest.configuration;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


/* web.xml */
public class MyWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {


  protected Class<?>[] getRootConfigClasses() {
    return null;
  }


  /*
      <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>/WEB-INF/applicationContext.xml</param-value>
      </init-param>
  */
  protected Class<?>[] getServletConfigClasses() {
    return new Class[]{MyConfig.class};
  }


  /*
  <servlet-mapping>
    <servlet-name>dispatcher</servlet-name>
    <url-pattern>/</url-pattern>
  </servlet-mapping>
*/
  protected String[] getServletMappings() {
    return new String[]{"/"};
  }
}
