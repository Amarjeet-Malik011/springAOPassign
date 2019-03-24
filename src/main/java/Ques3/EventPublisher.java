package Ques3;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher implements ApplicationEventPublisherAware {
    ApplicationEventPublisher publisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher=publisher;
    }
    public void connect(){
        CustomEvent customEvent=new CustomEvent(this);
        publisher.publishEvent(customEvent);
        System.out.println("database connected");
    }
}
