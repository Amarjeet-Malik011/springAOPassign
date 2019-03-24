package Ques8;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class PointCutAspects {

    @After("displayPointcut()")
    void afterAdvice(){
        System.out.println("Running after advice");
    }

    @Pointcut("execution(void display8())")
    void displayPointcut(){}

    @Before("getStringPointcut()")
    void beforeAdvice(){
        System.out.println("running before getString()");
    }

    @Pointcut("execution(String getString())")
    void getStringPointcut(){}
}
