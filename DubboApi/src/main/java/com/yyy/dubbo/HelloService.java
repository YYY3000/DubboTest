package com.yyy.dubbo;

/**
 * @author yinyiyun
 * @date 2018/5/28 9:28
 */
public interface HelloService {

    String hello(String name);

    String getName(Person person);

    Person getPerson(String id, String name);

}
