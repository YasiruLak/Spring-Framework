package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/12/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@Configuration
@Import(JPAConfig.class)
public class WebRootConfig {

    @Bean
    public LocalContainerEntityManagerFactoryBean EntityManagerFactory(){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        //bean.setJpaVendorAdapter(); //vendor
        //bean.setDataSource();
        bean.setPackagesToScan("lk.ijse.spring.entity"); //location where entity
        return bean;
    }
}
