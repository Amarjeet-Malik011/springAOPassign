package AOPExample;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class MultipleEventListener {

    @EventListener(CustomEvent.class)
    void stopped() {
        System.out.println("----------------stopped");
    }
    @EventListener(CustomEvent.class)
    void start() {
        System.out.println("----------------start");
    }

}
