package com.neutrinosys.containers;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyRepository {
    private LocalDateTime dateTime = LocalDateTime.now();

    public void save(Object object) {
        System.out.println("Saving... %s %s".formatted(object, dateTime));
    }
}
