package com.example.FirstJMSProject.config;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSException;
import oracle.jakarta.jms.AQjmsFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;


import javax.sql.DataSource;



@Configuration
@EnableJms
public class OracleAQConfig {
    public ConnectionFactory connectionFactory(DataSource dataSource) throws JMSException {
        return AQjmsFactory.getQueueConnectionFactory(dataSource);
    }
}
