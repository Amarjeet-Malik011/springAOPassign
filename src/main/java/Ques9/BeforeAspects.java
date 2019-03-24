package Ques9;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class BeforeAspects {

    @Before("execution(void display9())")
    void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Running before advice");
        System.out.println("JoinPoint= "+joinPoint);
        System.out.println("JoinPoint Reference= "+joinPoint.getThis());
        System.out.println("Signature of method= "+joinPoint.getSignature());
        System.out.println("Arguments of method= ");
        Object [] objects=joinPoint.getArgs();
        for (Object object:objects){
            System.out.println(object);
        }
    }

}

