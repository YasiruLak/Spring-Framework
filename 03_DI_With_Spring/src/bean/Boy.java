package bean;

import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/25/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
public class Boy {

    public Boy(){
        System.out.println("Boy Instantiated");
    }

    public void chattingWithGirl(){
        Girl girl = new Girl();
        girl.chat();
    }
}
