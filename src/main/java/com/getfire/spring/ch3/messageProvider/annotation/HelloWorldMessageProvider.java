package com.getfire.spring.ch3.messageProvider.annotation;

import com.getfire.spring.ch3.messageProvider.MessageProvider;
import org.springframework.stereotype.Service;

@Service("messageProvider")
public class HelloWorldMessageProvider implements MessageProvider {
    public String getMessage() {
        return "Hello World! from ";
    }
}
