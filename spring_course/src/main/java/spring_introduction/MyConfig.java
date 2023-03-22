package spring_introduction;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import spring_introduction.pet.Cat;
import spring_introduction.pet.Pet;

@Configuration
//@ComponentScan("spring_introduction")
public class MyConfig {

  @Bean
  @Scope("prototype")
  public Pet catBean() {
    return new Cat();
  }
  @Bean
  public Man manBean() {
    return new Man(catBean());
  }




}
