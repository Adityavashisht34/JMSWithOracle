package com.example.FirstJMSProject;

import jakarta.jms.ConnectionFactory;
import jakarta.jms.JMSException;

import oracle.jakarta.jms.AQjmsFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;


import javax.sql.DataSource;

@SpringBootApplication
@EnableJms
public class FirstJmsProjectApplication {
	@Bean
	public ConnectionFactory aqJmsConnectionFactory(DataSource ds) throws JMSException {
		return  AQjmsFactory.getConnectionFactory(ds);
	}
	public static void main(String[] args) {
		SpringApplication.run(FirstJmsProjectApplication.class, args);

	}

}
