package com.kafka.demo;

import com.kafka.demo.kafka.KafkaProducerConfig;
import com.kafka.demo.kafka.KafkaPublisher;
import com.kafka.demo.resource.Resource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		KafkaPublisher kafkaPublisher = new KafkaPublisher();
		Resource resource = new Resource("someId", "HelloWorld");
		kafkaPublisher.sendMessageToKafka(resource);
	}

}
