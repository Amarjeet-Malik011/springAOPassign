package AOPEx;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@Configuration
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("spring-config-aop.xml");
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext("AOPEx");
        Database database =context.getBean("database", Database.class);
        database.display();
        database.getInteger();
        database.throwException();
        database.aroundMethodTest();
    }
}
