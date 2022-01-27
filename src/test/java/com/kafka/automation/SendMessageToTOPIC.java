package com.kafka.automation;

import java.util.Properties;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;



public class SendMessageToTOPIC {

	public static void main(String[] args) {
		
		String brokers = "glider-01.srvs.cloudkafka.com:9094,glider-02.srvs.cloudkafka.com:9094,glider-03.srvs.cloudkafka.com:9094";
		String Username = "i60qos6p" ;
		String password = "Fwj8a0cff3ENtRKxY-UHI-5vdH3MCTDI" ;
		String topicName = "i60qos6p-TopicQA" ;
		
		//another topic name 
		String topic_name_02 = "i60qos6p-TopicStg";
		
		Properties prop = new Properties () ;
		
		prop.setProperty("bootstrap.servers", brokers);
		
		//converts objects to bytes 
		prop.setProperty("key.serializer", StringSerializer.class.getName());
		prop.setProperty("value.serializer", StringSerializer.class.getName());
		
		//Handle the Authentication 
		prop.setProperty("security.protocol", "SASL_SSL");
		prop.setProperty("sasl.mechanism", "SCRAM-SHA-256");
		prop.setProperty("sasl.jaas.config", "org.apache.kafka.common.security.scram.ScramLoginModule required username =\""+Username+"\" password =\""+password+"\";");
		
		//send message to topic from producer 
		KafkaProducer<String, String> myproducer = new KafkaProducer<>(prop);//create a KafkaProducer 
		
		ProducerRecord<String, String> record = new ProducerRecord<String, String>(topic_name_02, "{\r\n" + 
				"	\"rowset\":	{\r\n" + 
				"		\"osname\":	\"NCOMS\",\r\n" + 
				"		\"dbname\":	\"alerts\",\r\n" + 
				"		\"tblname\":	\"status\",\r\n" + 
				"		\"coldesc\":	[{\r\n" + 
				"				\"name\": \"Identifier\",\r\n" + 
				"				\"type\": \"string\",\r\n" + 
				"				\"size\": 255\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"Serial\",\r\n" + 
				"				\"type\": \"integer\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"Node\",\r\n" + 
				"				\"type\": \"string\",\r\n" + 
				"				\"size\": 64\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"NodeAlias\",\r\n" + 
				"				\"type\": \"string\",\r\n" + 
				"				\"size\": 64\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"AlertKey\",\r\n" + 
				"				\"type\": \"string\",\r\n" + 
				"				\"size\": 255\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"Severity\",\r\n" + 
				"				\"type\": \"integer\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"Summary\",\r\n" + 
				"				\"type\": \"string\",\r\n" + 
				"				\"size\": 255\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"StateChange\",\r\n" + 
				"				\"type\": \"utc\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"FirstOccurrence\",\r\n" + 
				"				\"type\": \"utc\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"LastOccurrence\",\r\n" + 
				"				\"type\": \"utc\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}, {\r\n" + 
				"				\"name\": \"RowSerial\",\r\n" + 
				"				\"type\": \"integer\",\r\n" + 
				"				\"size\": 4\r\n" + 
				"			}],\r\n" + 
				"		\"rows\":		[{\r\n" + 
				"				\"Identifier\": \"Startup@sol9-build1\",\r\n" + 
				"				\"Serial\": 12469,\r\n" + 
				"				\"Node\": \"sol9-build1\",\r\n" + 
				"				\"NodeAlias\": \"\",\r\n" + 
				"				\"AlertKey\": \"\",\r\n" + 
				"				\"Severity\": 0,\r\n" + 
				"				\"Summary\": \"ObjectServer NCOMS on sol9-build1 started at Wed Jul 04 15:27:57 2012\",\r\n" + 
				"				\"StateChange\": 1341412082,\r\n" + 
				"				\"FirstOccurrence\": 1341411978,\r\n" + 
				"				\"LastOccurrence\": 1341412077,\r\n" + 
				"				\"RowSerial\": 12469\r\n" + 
				"			}, {\r\n" + 
				"				\"Identifier\": \"ProfilerEnableToggle@NCOMS:sol9-build1\",\r\n" + 
				"				\"Serial\": 12468,\r\n" + 
				"				\"Node\": \"sol9-build1\",\r\n" + 
				"				\"NodeAlias\": \"\",\r\n" + 
				"				\"AlertKey\": \"\",\r\n" + 
				"				\"Severity\": 0,\r\n" + 
				"				\"Summary\": \"ObjectServer NCOMS Profiler enabled at Wed Jul 04 15:27:56 2012\",\r\n" + 
				"				\"StateChange\": 1341412077,\r\n" + 
				"				\"FirstOccurrence\": 1341411976,\r\n" + 
				"				\"LastOccurrence\": 1341412076,\r\n" + 
				"				\"RowSerial\": 12468\r\n" + 
				"			}, {\r\n" + 
				"				\"Identifier\": \"Shutdown@sol9-build1\",\r\n" + 
				"******* TRUNCATED ********\r\n" + 
				"				\"RowSerial\": 12519\r\n" + 
				"			}],\r\n" + 
				"		\"affectedRows\": 13\r\n" + 
				"	}\r\n" + 
				"}");
		//Create a Producer Record and send the Message value to the particular topic Name 
		
		//Publish the message to particular  Key and Value 
		ProducerRecord<String, String> recordKey = new ProducerRecord<String, String>(topicName, "ats_key_017" , "ats_value_010");
		
		//Publish the message to particular Partition - Key and Value 
		ProducerRecord<String, String> recordKey_partition = new ProducerRecord<String, String>(topicName, 2 , "ats_key_20" , "ats_value_0200");
		
		//Publish the message to particular Partition - Key and Value  - to another topic name 
		ProducerRecord<String, String> recordKey_topic2 = new ProducerRecord<String, String>(topic_name_02, 3 , "ats_key_400" , "ats_value_0400");
		
		myproducer.send(record);
		//push all the messages to the topic 
		
		//push the message to the topic with partition as key and value 
		myproducer.send(recordKey);
				
		//push the message to the topic with partition as key and value 
		myproducer.send(recordKey_partition);
		
		//push the message to the another  topic with partition as key and value 
		myproducer.send(recordKey_topic2);
		
		
		
		myproducer.flush();
		//close the Producer 
		myproducer.close();
		
		
		
		
		
		
		
		

	}

}
