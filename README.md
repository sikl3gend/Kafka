# Kafka

This application demonstrates a fundamental understanding and rudimentary implementation of Kafka. Kafka is an event streaming platform that is used to publish, store, and process streams of events. It consists of a broker, topic, producer, and consumer. The broker here is my local machine with port 9092 exposed. 

A topic is the container which messages are stored in, where producer send events to, and where consumer read events from. They are subdivided by partitions which are accessed by offsets.

 The producer sends events to the topic. They are also in charge of which partition the event is sent to. If the key is null, it will distribute events in a round robin fashion to the partitions.

The consumer is what consumes an event. The special thing about Kafka is that once a message is consumed, it doesn't go away. Other consumers can also have access to it. The messages persist usually until a certain length of time has passed, or if the topic grows to a certain size.
