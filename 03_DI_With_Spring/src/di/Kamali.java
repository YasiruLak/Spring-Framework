package di;

import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/26/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
public class Kamali {

    public Kamali(){
        System.out.println("Kamali is in Context");
    }

    public void chat(){
        System.out.println("Chatting");
    }
}
