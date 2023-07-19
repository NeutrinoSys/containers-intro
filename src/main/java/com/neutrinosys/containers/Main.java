package com.neutrinosys.containers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        MyService myService = new MyService(myRepository);
        ApplicationContext context = new AnnotationConfigApplicationContext("com.neutrinosys.containers");
        for (int count=0; count<5; count++) {
            MyService myService = context.getBean(MyService.class);
            myService.process("hello");
            Thread.sleep(1000);
        }
    }
}
