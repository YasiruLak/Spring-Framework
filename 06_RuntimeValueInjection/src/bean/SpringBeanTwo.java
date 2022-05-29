package bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/29/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
public class SpringBeanTwo implements InitializingBean {
    @Value("C001")
    private String id;
    @Value("Yasiru")
    private String name;
    @Value("Galle")
    private String address;
    @Value("1000.0")
    private double salary;

    public SpringBeanTwo() {

    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Default Constructor");
        System.out.println(id);
        System.out.println(name);
        System.out.println(address);
        System.out.println(salary);
    }
}
