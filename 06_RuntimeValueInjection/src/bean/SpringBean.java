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

//    public SpringBean(@Value("C001") String id, @Value("10") int age, @Value("true") boolean b) {
//        System.out.println("Spring Bean Instantiated");
//        System.out.println(id);
//        System.out.println(age);
//        System.out.println(b);
//    }

    public SpringBean(@Value("Yasiru,Kasun,amal") String[] myNames) {
        System.out.println("Spring Bean Instantiated");
        for (String myName : myNames){
            System.out.println(myName);
        }
    }
}
