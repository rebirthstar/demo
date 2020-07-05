package com.pinan.demo.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author LT
 * @version 1.0
 * @description com.pinan.demo.kafka
 * @date 2020/6/16
 */
@Component
public class ConsumerListener {

    private Logger logger = LoggerFactory.getLogger(ConsumerListener.class);

    //@KafkaListener(id = "foo", topics = "kafka-boot")
    public void listen1(String foo) {
        logger.info("message content [{}]", foo);
    }

}