package be.ordina.kickstart.jms.topic.receiver;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class TopicReceiverApplication {

    private static final Logger LOG = LoggerFactory.getLogger(TopicReceiverApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(TopicReceiverApplication.class);
    }

    @Component
    public static class Receiver {

       // TODO Create a method that subscribes to the testTopic using a JmsListener

    }

}
