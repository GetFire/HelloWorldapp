package com.getfire.spring.ch4.jsr330;

public interface MessageRendererJsr {
    void render();
    void setMessageProvider(MessageProviderJsr messageProvider);
    MessageProviderJsr getMessageProvider();
}
