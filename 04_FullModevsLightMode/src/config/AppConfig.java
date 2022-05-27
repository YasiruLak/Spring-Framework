package config;

import bean.SpringBeanOne;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/27/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    @Bean
    public SpringBeanOne getBeanOne(){
        //Inter Bean Dependency
        SpringBeanTwo beanTwo = getBeanTwo();
        SpringBeanTwo beanTwo2 = getBeanTwo();
        System.out.println(beanTwo);
        System.out.println(beanTwo2);
        return new SpringBeanOne();
    }

    @Bean
    public SpringBeanTwo getBeanTwo(){
        return new SpringBeanTwo();
    }
}
