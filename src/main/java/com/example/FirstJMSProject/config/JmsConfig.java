package com.example.FirstJMSProject.config;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;

//@Configuration
//@EnableJms
public class JmsConfig {
//
//    @Bean
//    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory(ConnectionFactory connectionFactory){
//        DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory = new DefaultJmsListenerContainerFactory();
//        defaultJmsListenerContainerFactory.setConnectionFactory(connectionFactory);
//        return defaultJmsListenerContainerFactory;
//    }


}
