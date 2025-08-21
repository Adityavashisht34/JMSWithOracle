package com.example.FirstJMSProject.consumer;
import oracle.jdbc.internal.JMSMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
@Component
public class MessageConsumer {
    @JmsListener(destination = "Table_Alteration_Queue1")
    public void receiveMessage(String message) {
        System.out.print(message);
    }
}
