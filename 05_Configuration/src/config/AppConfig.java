package config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/28/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
@ComponentScan(basePackages = "bean")
@Import({AppConfigOne.class,AppConfigTwo.class})// we can import configurations into a single class
//@ImportResource("classpath:abcd.xml") // we can use this annotation to import xml configurations to the context
//@ImportResource("file:absolute-path-of-abcd.xml")
public class AppConfig {

}
