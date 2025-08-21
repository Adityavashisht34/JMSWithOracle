package com.example.FirstJMSProject.producer;

import com.example.FirstJMSProject.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageProducer {

//    @Autowired
//    private JmsTemplate jmsTemplate;
//
//    @PostMapping
//    public void sendMessage(@RequestBody Message message){
//        try{
//            jmsTemplate.convertAndSend("MyQueue1",message.getMessage());
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//    }

}
