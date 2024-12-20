package com.bzetab.msk.estiba.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import jakarta.jms.ConnectionFactory;

@Configuration
public class JmsConfig {

    @Bean
    public ConnectionFactory connectionFactory() {
        // Usar ActiveMQConnectionFactory en lugar de PooledConnectionFactory
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
        connectionFactory.setBrokerURL("tcp://localhost:61616");  // Ajusta la URL del broker
        return connectionFactory;
    }

    @Bean
    public JmsTemplate jmsTemplate(ConnectionFactory connectionFactory) {
        SingleConnectionFactory singleConnectionFactory = new SingleConnectionFactory(connectionFactory);
        return new JmsTemplate(singleConnectionFactory);
    }
}
