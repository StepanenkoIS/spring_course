package spring_introduction;


import org.springframework.context.annotation.*;
import spring_introduction.pet.Cat;
import spring_introduction.pet.Pet;

@Configuration
//@ComponentScan("spring_introduction")
@PropertySource("classpath:myApp.properties")
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
