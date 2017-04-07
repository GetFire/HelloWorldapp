package com.getfire.spring.ch3.messageProvider;

import com.getfire.spring.ch3.messageProvider.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World!";
    }
}
