package com.girish.practice.function;

import com.girish.practice.domain.Subscribers;
import com.girish.practice.service.SubscriberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Subscriber {

    @Autowired
    private SubscriberService subscriberService;

    @Bean
    public Supplier<List<Subscribers>> findAll(){
        return ()->subscriberService.getSubscribersList();
    }

    @Bean
    public BiConsumer<String, String> addSubscriber(){
        return (name, emailId)-> subscriberService.addSubscriber(name, emailId);
    }
}
