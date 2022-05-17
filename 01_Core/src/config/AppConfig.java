package config;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/17/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "bean")
public class AppConfig {

    public AppConfig(){
        System.out.println("AppConfig Object Created");
    }

}
