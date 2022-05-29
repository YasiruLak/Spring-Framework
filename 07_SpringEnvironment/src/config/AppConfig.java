package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/29/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "bean")
@PropertySource("classpath:application.properties")
public class AppConfig {
}
