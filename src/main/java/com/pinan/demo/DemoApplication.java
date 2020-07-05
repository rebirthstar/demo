package com.pinan.demo;

import com.sun.jmx.remote.internal.ArrayQueue;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

	public static Logger logger = LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		HashSet<Object> objects = new HashSet<>();

	}
}
