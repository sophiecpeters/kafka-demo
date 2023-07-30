package com.kafka.demo.kafka;

import com.kafka.demo.resource.Resource;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaPublisher {

    KafkaTemplate<String, String> kafkaTemplate;

public KafkaPublisher(KafkaTemplate<String, String> kafkaTemplate){
    this.kafkaTemplate = kafkaTemplate;
}

     public void sendMessageToKafka(Resource resource){
          kafkaTemplate.send("someTopic", resource.id);
     }
}
