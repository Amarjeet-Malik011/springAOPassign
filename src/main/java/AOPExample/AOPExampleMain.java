package AOPExample;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AOPExampleMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext("AOPExample");
//        context.start();
        Dummy dummy=context.getBean("dummy",Dummy.class);
        dummy.display();
        context.stop();
        context.close();
    }
}
