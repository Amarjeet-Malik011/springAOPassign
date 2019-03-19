package Ques7;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        ServiceBean serviceBean=(ServiceBean) context.getBean("serviceBean");
        serviceBean.display();
        serviceBean.multiply(10);
        serviceBean.sum(20);
        context.stop();

    }



}
