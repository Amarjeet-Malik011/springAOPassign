package Ques5;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        Service service=(Service) context.getBean("service2");
        service.display5();
        context.stop();

    }
}
