package config;

import bean.SpringBeanFive;
import bean.SpringBeanFour;
import bean.SpringBeanTwo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/28/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
public class AppConfigTwo {


    @Bean
    public SpringBeanFour springBeanFour(){
        return new SpringBeanFour();
    }

    @Bean
    public SpringBeanFive springBeanFive(){
        return new SpringBeanFive();
    }
}
