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
public class SpringBranOne implements InitializingBean {

    //${} Property Placeholder
    @Value("${user.name}")
    public String osName;

    @Value("${LOGNAME}")
    private String logName;

    @Value("${ijse.application.name}")
    private String projectName;

    @Value("${ijse.application.db}")
    private String dbName;



    public SpringBranOne() {
        System.out.println("Spring Bean One Instantiated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
//        System.out.println(osName);
//        System.out.println(logName);
//        System.out.println(projectName);
//        System.out.println(dbName);
    }
}
