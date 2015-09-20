package be.ordina.kickstart.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This message listener captures all received messages in a List.
 *
 * TODO Implement MessageListener interface
 */
public class MessageCapturingMessageListener {

    private static final Logger LOG = LoggerFactory.getLogger(MessageCapturingMessageListener.class);

    private List<String> messages = new CopyOnWriteArrayList<>();

    public List<String> getMessages() {
        return messages;
    }

    /**
     * TODO Implement onMessage method from the MessageListener interface
     * Add received messages to the messages List
     */
}
