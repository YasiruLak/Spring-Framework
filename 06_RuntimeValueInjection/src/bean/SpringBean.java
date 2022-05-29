package bean;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/29/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean {

//    public SpringBean() {
//        System.out.println("Spring Bean Default Constructor");
//    }

    public SpringBean(@Value("C001") String id) {
        System.out.println("Spring Bean Instantiated");
        System.out.println(id);
    }
}
