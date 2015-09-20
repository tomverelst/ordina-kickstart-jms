package be.ordina.kickstart.jms;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * This message listener captures all received messages in a List.
 *
 * TODO Implement the Message Listener interface (you can copy the code from exercise 02)
 */
public class MessageCapturingMessageListener {

    private static final Logger LOG = LoggerFactory.getLogger(MessageCapturingMessageListener.class);

    private List<String> messages = new CopyOnWriteArrayList<>();

    public List<String> getMessages() {
        return messages;
    }
}
