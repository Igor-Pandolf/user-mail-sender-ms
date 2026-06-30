package dev.java10x.user.configuration;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQ {

    public static final String queueName = "user-queue";

    @Bean
    public Queue queue() {
        return new Queue(queueName, true);
    }

}
