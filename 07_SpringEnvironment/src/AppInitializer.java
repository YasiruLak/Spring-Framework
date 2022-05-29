import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/29/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        context.registerShutdownHook();


        //Access System Environment Variables With Java
        //System.getenv();

        Map<String, String> getenv = System.getenv();
        for (String key : getenv.keySet()) {
            System.out.println(key+" : "+getenv.get(key));
        }
    }
}
