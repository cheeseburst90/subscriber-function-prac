package com.girish.practice.service;

import com.girish.practice.domain.Subscribers;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class SubscriberService {

    @Getter
    private List<Subscribers> subscribersList = new ArrayList<>();

    public void addSubscriber(String name, String emailId) {
        subscribersList.add(new Subscribers(name, emailId));
    }
}
