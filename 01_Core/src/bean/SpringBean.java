package bean;

import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/17/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
public class SpringBean {

    public SpringBean(){
        System.out.println("Spring Bean Object Created");
    }

    public void testBean(){
        System.out.println("Yes, Spring Bean Is Working");
    }
}
