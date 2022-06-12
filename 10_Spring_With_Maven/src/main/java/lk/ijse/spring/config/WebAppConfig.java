package lk.ijse.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/9/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "lk.ijse")
@EnableWebMvc
public class WebAppConfig {
}
