package Ques8;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext("springAOPassign-config.xml");
        context.start();
        PointCutService pointCutService= (PointCutService) context.getBean("pointCutService");
        pointCutService.display8();
        System.out.println(pointCutService.getString());
        context.stop();
    }
}
