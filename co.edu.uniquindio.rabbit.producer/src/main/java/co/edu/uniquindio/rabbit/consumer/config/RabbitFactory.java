package co.edu.uniquindio.rabbit.consumer.config;

import com.rabbitmq.client.ConnectionFactory;

public class RabbitFactory {
    private ConnectionFactory connectionFactory;
    public RabbitFactory() {
        this.connectionFactory = new ConnectionFactory();
        this.connectionFactory.setHost("localhost");
        this.connectionFactory.setPort(15672);
        this.connectionFactory.setUsername("dev_pr3");
        this.connectionFactory.setPassword("123456");
    }

    public ConnectionFactory getConnectionFactory() {
        return connectionFactory;
    }
}
