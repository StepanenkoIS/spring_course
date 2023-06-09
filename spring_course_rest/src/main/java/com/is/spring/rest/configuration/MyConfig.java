package com.is.spring.rest.configuration;


import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.Properties;


/* applicationContext.xml */

@Configuration
@ComponentScan(basePackages = "com.is.spring.rest") /* <context:component-scan base-package="com.is.rest" /> */
@EnableWebMvc /* <mvc:annotation-driven/> */
@EnableTransactionManagement /* <tx:annotation-driven transaction-manager="transactionManager" />  */
public class MyConfig {


  /*
      <bean id="dataSource" class="com.mchange.v2.c3p0.ComboPooledDataSource"
          destroy-method="close">
        <property name="driverClass" value="com.mysql.cj.jdbc.Driver" />
        <property name="jdbcUrl" value="jdbc:mysql://localhost:3306/my_db?useSSL=false&amp;serverTimezone=UTC" />
        <property name="user" value="bestuser" />
        <property name="password" value="bestuser" />
    </bean>
  */
  @Bean
  public DataSource dataSource() {
    ComboPooledDataSource dataSource = new ComboPooledDataSource();
    try {
      dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
      dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/my_db?useSSL=false&serverTimezone=UTC");
      dataSource.setUser("bestuser");
      dataSource.setPassword("bestuser");
    } catch (PropertyVetoException e) {
      throw new RuntimeException(e);
    }
    return dataSource;
  }

    /*
    <bean id="sessionFactory"
          class="org.springframework.orm.hibernate5.LocalSessionFactoryBean">
        <property name="dataSource" ref="dataSource" />
        <property name="packagesToScan" value="com.is.spring.mvc_hibernate_aop.entity" />
        <property name="hibernateProperties">
            <props>
                <prop key="hibernate.dialect">org.hibernate.dialect.MySQLDialect</prop>
                <prop key="hibernate.show_sql">true</prop>
            </props>
        </property>
    </bean>
  */

  @Bean
  public LocalSessionFactoryBean sessionFactoryBean() {
    LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();

    sessionFactoryBean.setDataSource(dataSource());
    sessionFactoryBean.setPackagesToScan("com.is.spring.rest.entity");

    Properties hibernateProperties = new Properties();
    hibernateProperties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
    hibernateProperties.setProperty("hibernate.show_sql", "true");

    sessionFactoryBean.setHibernateProperties(hibernateProperties);

    return sessionFactoryBean;
  }

      /*
    <bean id="transactionManager"
          class="org.springframework.orm.hibernate5.HibernateTransactionManager">
        <property name="sessionFactory" ref="sessionFactory"/>
    </bean>
  */

  @Bean
  public HibernateTransactionManager transactionManager() {
    HibernateTransactionManager transactionManager = new HibernateTransactionManager();
    transactionManager.setSessionFactory(sessionFactoryBean().getObject());
    return transactionManager;
  }


}
