import config.AppConfig;
import config.AppConfigOne;
import config.AppConfigTwo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/28/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.register(AppConfigOne.class);
        context.register(AppConfigTwo.class);
        context.refresh();
        context.registerShutdownHook();
    }
}
