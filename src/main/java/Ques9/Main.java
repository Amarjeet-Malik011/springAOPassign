package Ques9;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        BeforeAdvice beforeAdvice = (BeforeAdvice) context.getBean("beforeAdvice");
        beforeAdvice.display9();
        context.stop();
    }
}
