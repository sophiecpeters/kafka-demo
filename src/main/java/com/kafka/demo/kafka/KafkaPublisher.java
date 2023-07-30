package com.kafka.demo.kafka;

import com.kafka.demo.resource.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisher {

    @Autowired
     KafkaTemplate<String, Resource> kafkaTemplate;

     public void sendMessageToKafka(Resource resource){
          kafkaTemplate.send("someTopic",resource);
     }
}
