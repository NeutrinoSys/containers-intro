package com.neutrinosys.containers;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public void save(Object object) {
        System.out.println("Saving... " + object);
    }
}
