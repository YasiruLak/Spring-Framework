package bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/18/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
@Scope("prototype")
public class BeanOne {

    public BeanOne(){
        System.out.println("One");
    }
}
