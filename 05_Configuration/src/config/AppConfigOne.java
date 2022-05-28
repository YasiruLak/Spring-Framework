package config;

import bean.SpringBeanThree;
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
public class AppConfigOne {

    @Bean
    public SpringBeanTwo springBeanTwo(){
        return new SpringBeanTwo();
    }

    @Bean
    public SpringBeanThree springBeanThree(){
        return new SpringBeanThree();
    }
}
