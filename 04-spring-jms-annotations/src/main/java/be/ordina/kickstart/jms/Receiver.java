package be.ordina.kickstart.jms;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Receiver {

    private List<String> messages = new ArrayList<>();

    /**
     * TODO
     * Create a method that consumes messages from the "testQueue" topic
     * using the @JmsListener annotation
     * Add consumed messages to the list
     */

    public List<String> getReceivedMessages() {
        return messages;
    }
}
