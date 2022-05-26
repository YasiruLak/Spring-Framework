package bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
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
@Primary
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GirlOne implements GoodGirl, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean, DisposableBean {

    public GirlOne() {
        System.out.println("Girl One Instantiated");
    }

    @Override
    public void chat() {
        System.out.println("Girl One is Chatting");
    }


    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Girl One Bean Factory Aware");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("Girl One Bean Name Aware");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Girl One Disposable Bean Aware");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Girl One Initializing Bean Aware");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Girl One Application Context");
    }
}
