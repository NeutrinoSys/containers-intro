package com.neutrinosys.containers;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class MyService {

    private MyRepository myRepository;

    public void process(Object object) {
        System.out.println("Processing... " + object);
        myRepository.save(object.toString().toUpperCase());
    }

    @Inject
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
        System.out.println("Received the repository...");
    }
}
