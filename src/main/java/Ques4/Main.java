package Ques4;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        Service service= (Service)context.getBean("service1");
        service.display();
        context.stop();
    }
}