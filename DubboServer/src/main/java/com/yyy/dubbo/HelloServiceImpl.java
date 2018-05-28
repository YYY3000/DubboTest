package com.yyy.dubbo;

public class HelloServiceImpl implements HelloService {

    public String hello(String name) {
        return "Hello " + name + "!";
    }

    public String getName(Person person) {
        return person.getName();
    }

    public Person getPerson(String id, String name) {
        return new Person(id, name);
    }
}
