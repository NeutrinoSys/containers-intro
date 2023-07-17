package com.neutrinosys.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        MyService myService = new MyService(myRepository);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.neutrinosys.containers");
        MyService myService = context.getBean(MyService.class);
        myService.process("hello");
    }
}
