package Ques7;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceBeanAspects {


/*    @Before("bean(serviceBean))")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }*/

/*    @Before("args(Integer)")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }*/

/*    @Before("this(Ques7.ServiceBean)")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }*/

    @Before("within(Ques7.*)")
    void beforeAdvice() {
        System.out.println("Running before advice");
    }
}
