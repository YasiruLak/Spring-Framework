package bean;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.cache.interceptor.CacheProxyFactoryBean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/22/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
//@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SpringBeanOne {

    public SpringBeanOne(){
        System.out.println("Spring Bean One");
    }

}
