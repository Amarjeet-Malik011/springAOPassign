package Ques6;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        ExceptionService exceptionService = (ExceptionService) context.getBean("exceptionService");
        exceptionService.throwException();
        context.stop();

    }
}