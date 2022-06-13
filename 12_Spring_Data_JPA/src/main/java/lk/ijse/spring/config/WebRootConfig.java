package lk.ijse.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;

import javax.sql.DataSource;

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
    public LocalContainerEntityManagerFactoryBean EntityManagerFactory(DataSource dataSource, JpaVendorAdapter jpaVendorAdapter){
        LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
        bean.setJpaVendorAdapter(jpaVendorAdapter); //vendor
        bean.setDataSource(dataSource);
        bean.setPackagesToScan("lk.ijse.spring.entity"); //location where entity
        return bean;
    }

    @Bean
    public DataSource dataSource(){
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setUrl("jdbc:mysql://localhost:3306/springjpa?createDatabaseIfNotExist=true");
        source.setUsername("root");
        source.setPassword("19980611");
        source.setDriverClassName("com.mysql.jdbc.Driver");
        return source;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter(){

    }
}
