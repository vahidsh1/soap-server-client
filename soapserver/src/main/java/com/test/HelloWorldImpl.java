package com.test;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.test.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHelloWorld(String content)  {
//        throw new RuntimeException(content);
        return "Hello" + content + " ! ";
//        return new RuntimeException();
    }
}
