package AOPExample;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class Dummy implements ApplicationEventPublisherAware {
    ApplicationEventPublisher applicationEventPublisher;
    public void display(){
        CustomEvent customEvent=new CustomEvent(this);
        applicationEventPublisher.publishEvent(customEvent);
        System.out.println("display");
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
}
