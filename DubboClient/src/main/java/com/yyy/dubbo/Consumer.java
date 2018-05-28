package com.yyy.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        HelloService helloService = context.getBean(HelloService.class);
        System.out.println("consumer");
        System.out.println(helloService.hello("YYY"));
        System.out.println(helloService.getName(new Person("1", "YYY")));
        System.out.println(helloService.getPerson("1", "YYY").getName());
    }
}
