package com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
