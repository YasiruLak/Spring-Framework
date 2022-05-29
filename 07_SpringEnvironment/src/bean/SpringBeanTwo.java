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
//@Component
public class SpringBeanTwo implements InitializingBean {

    @Value("${my.name}")
    private String myName;
    @Value("${my.age}")
    private String myAge;

    public SpringBeanTwo() {
        System.out.println("Spring Bean Two");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println(myName);
//        System.out.println(myAge);
    }
}
