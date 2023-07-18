package com.neutrinosys.containers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service
public class MyService {

    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public void process(Object object) {
        System.out.println("Processing... " + object);
        myRepository.save(object.toString().toUpperCase());
    }
}
