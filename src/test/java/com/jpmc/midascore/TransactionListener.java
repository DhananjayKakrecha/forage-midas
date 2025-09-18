package com.jpmc.midascore;

import com.jpmc.midascore.foundation.Transaction;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class TransactionListener {
    @KafkaListener(topics = "${general.kafka-topic}",groupId = "group-1")
    public void listen(Transaction transaction){
        System.out.println("Received Transaction: "+transaction);
        return;
    }
}
