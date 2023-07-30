package com.kafka.demo;

import com.kafka.demo.kafka.KafkaProducerConfig;
import com.kafka.demo.kafka.KafkaPublisher;
import com.kafka.demo.resource.Resource;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class DemoApplication {



	public static void main(String[] args) {

		//SpringApplication.run(DemoApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(KafkaProducerConfig.class);
		KafkaTemplate kafkaTemplate = context.getBean(KafkaTemplate.class);


		KafkaPublisher kafkaPublisher = new KafkaPublisher(kafkaTemplate);
		Resource resource = new Resource("someId", "HelloWorld");
		kafkaPublisher.sendMessageToKafka(resource);
	}

}
