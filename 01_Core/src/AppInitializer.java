import bean.BeanOne;
import bean.BeanThree;
import bean.BeanTwo;
import bean.MyConnection;
import config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/17/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
public class AppInitializer {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

//        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("JVM is about to Shut Down");
//                ctx.close();
//            }
//        }));

        ctx.registerShutdownHook();

        ctx.register(AppConfig.class);
        ctx.refresh();
//
//        BeanOne bean1 = ctx.getBean(BeanOne.class);
//        BeanTwo bean2 = ctx.getBean(BeanTwo.class);
//        System.out.println(bean1);
//        System.out.println(bean2);
//
//        BeanThree bean3 = ctx.getBean(BeanThree.class);
//        System.out.println(bean3);

//        BeanOne beanOne = (BeanOne) ctx.getBean("beanOne");
//        System.out.println(beanOne);
//
//        BeanTwo beanTwo = (BeanTwo) ctx.getBean("beanTwo");
//        System.out.println(beanTwo);
//
//        BeanThree beanThree = (BeanThree) ctx.getBean("beanThree");
//        System.out.println(beanThree);

//        MyConnection bean = ctx.getBean(MyConnection.class);
//        System.out.println(bean);
//
//        MyConnection myConnection = (MyConnection) ctx.getBean("getConnection");
//        System.out.println(myConnection);

        BeanOne ref1 = ctx.getBean(BeanOne.class);
        BeanOne ref2 = ctx.getBean(BeanOne.class);
        BeanOne ref3 = ctx.getBean(BeanOne.class);
        System.out.println(ref1);
        System.out.println(ref2);
        System.out.println(ref3);

        BeanTwo b2ref1 = ctx.getBean(BeanTwo.class);
        BeanTwo b2ref2 = ctx.getBean(BeanTwo.class);
        System.out.println(b2ref1);
        System.out.println(b2ref2);

        MyConnection con1 = ctx.getBean(MyConnection.class);
        MyConnection con2 = ctx.getBean(MyConnection.class);
        System.out.println(con1);
        System.out.println(con2);

    }
}
