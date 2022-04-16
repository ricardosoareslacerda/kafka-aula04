package br.com.fiap.dataintegration.kafkaproducer.controller;


import br.com.fiap.dataintegration.kafkaproducer.producer.TopicProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/kafka")
public class KafkaProducerController {

    private final TopicProducer topicProducer;

    @GetMapping("/send")
    public void send() {
        topicProducer.send("Messagem de teste enviada para o Kafka");
    }
}
