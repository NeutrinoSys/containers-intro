package com.neutrinosys.containers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyService {

    private MyRepository myRepository;
    private LocalDateTime dateTime = LocalDateTime.now();

    public void process(Object object) {
        System.out.println("Processing... %s %s".formatted(object, dateTime));
        myRepository.save(object.toString().toUpperCase());
    }

    @Autowired
    public void setMyRepository(MyRepository myRepository) {
        this.myRepository = myRepository;
    }
}
