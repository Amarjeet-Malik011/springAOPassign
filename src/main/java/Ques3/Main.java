package Ques3;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        EventPublisher eventPublisher=(EventPublisher) context.getBean("eventPublisher");
        eventPublisher.connect();
    }
}
