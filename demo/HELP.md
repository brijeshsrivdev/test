# Getting Started

### Reference Documentation

* https://github.com/sulthan309/Live-Dashboard-using-Kafka-and-Spring-Websocket
* Above application sends data from server to UI.

* Need to send data to kafka topic
 #### bin/kafka-console-producer.sh --topic livetemperature --bootstrap-server localhost:9092

* server is bind
  @Override
  public void configureMessageBroker(MessageBrokerRegistry registry) {
  registry.enableSimpleBroker("/topic");
  }
* 
* UI is subscribed 