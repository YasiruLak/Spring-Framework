import bean.MyConnection;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/27/2022
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

        MyConnection bean = context.getBean(MyConnection.class);
        System.out.println(bean);
    }
}
