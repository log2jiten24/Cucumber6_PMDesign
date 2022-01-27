package com.kafka.automation;

import java.util.Arrays;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;

public class GetLatestMessagefromKafkaTopic {

	public static void main(String[] args) {

		String brokers = "glider-01.srvs.cloudkafka.com:9094,glider-02.srvs.cloudkafka.com:9094,glider-03.srvs.cloudkafka.com:9094";
		String Username = "i60qos6p";
		String password = "Fwj8a0cff3ENtRKxY-UHI-5vdH3MCTDI";
		String topicName = "i60qos6p-TopicQA";

		// another topic name
		String topic_name_02 = "i60qos6p-TopicStg";

		Properties prop = new Properties();

		prop.setProperty("bootstrap.servers", brokers);

		// converts bytes to objects --use Deserializer method
		prop.setProperty("key.deserializer", StringDeserializer.class.getName());
		prop.setProperty("value.deserializer", StringDeserializer.class.getName());

		// Handle the Authentication
		prop.setProperty("security.protocol", "SASL_SSL");
		prop.setProperty("sasl.mechanism", "SCRAM-SHA-256");
		prop.setProperty("sasl.jaas.config",
				"org.apache.kafka.common.security.scram.ScramLoginModule required username =\"" + Username
						+ "\" password =\"" + password + "\";");

		// get the latest message from the kafka topic
		prop.setProperty("auto.offset.reset", "latest");

		// set the consumer group id
		prop.setProperty("group.id", "myconsumer");

		// Create Consumer Object using the KafkaConsumer Class

		KafkaConsumer<String, String> consumer = new KafkaConsumer<String, String>(prop);

		// from which topic we wanted to consume -pass the topic name as collection as
		// we can pass multiple topic names
		consumer.subscribe(Arrays.asList(topicName, topic_name_02));

		// set the initial flag as true
		boolean flag = true;

		while (true) {

			ConsumerRecords<String, String> records = consumer.poll(10);

			for (ConsumerRecord<String, String> record : records) {

				String msg = record.value();
				System.out.println("latest record value :" + record.value());

				long offSet = record.offset();
				System.out.println("Offset Value is : " + offSet);

				if (offSet > 0) {
					flag = false;
					consumer.close();
                
				}

			}

		}
	}

}
