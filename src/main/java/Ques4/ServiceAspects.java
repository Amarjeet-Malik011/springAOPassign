package Ques4;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class ServiceAspects{

    @Before("execution(public void display4())")
    void beforeAdvice() {
        System.out.println("Before 1 advice is running");
    }
}
