package AOPEx;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {

    @Before("execution(public void display())")
    void beforeAdvice() {
        System.out.println("Before advice is running");
    }
    @After("execution(void display())")
    void afterAdvice(){
        System.out.println("running after advice");

    }
    @AfterReturning(pointcut = "execution(Integer getInteger())", returning= "returnValue")
    void adviceAfterReturning(Integer returnValue){
        System.out.println("printing advice after returning= "+returnValue);
    }
    @AfterThrowing(pointcut = "execution(void throwException())", throwing = "e")
    void adviceAfterReturning(Exception e){
        System.out.println("printing advice after returning= "+e);
    }
    @Around("execution(void aroundMethodTest())")
    void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("Around before");
        proceedingJoinPoint.proceed();
        System.out.println("Around after");

    }
}
