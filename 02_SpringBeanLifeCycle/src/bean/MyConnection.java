package bean;

import org.springframework.beans.factory.DisposableBean;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/22/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public class MyConnection implements DisposableBean {
    public MyConnection(){
        System.out.println("My Connection");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("My Connection Destroyed");
    }
}
