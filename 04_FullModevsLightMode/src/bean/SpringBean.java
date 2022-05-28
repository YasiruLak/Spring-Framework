package bean;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/28/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@Component
public class SpringBean {

    public SpringBean() {
        System.out.println("Spring Bean Instantiated");
    }


    @Bean
    public MyBasicDataSource basicDataSource() {

        //inter-bean dependency invocation
        MyConnection myConnection1 = myConnection();
        MyConnection myConnection2 = myConnection();
        MyConnection myConnection3 = myConnection();

        System.out.println(myConnection1);
        System.out.println(myConnection2);
        System.out.println(myConnection3);

        MyBasicDataSource myBasicDataSource = new MyBasicDataSource();
        myBasicDataSource.setMyConnection(myConnection1);

        return myBasicDataSource;
    }

    @Bean
    public MyConnection myConnection() {
        return new MyConnection();
    }
}
