package com.getfire.spring.ch4.jsr330;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named("messageRendererJsr")
@Singleton
public class StandartOutMessageRendererJsr implements MessageRendererJsr {

    @Inject
    @Named("messageProviderJsr")
    private MessageProviderJsr messageProviderJsr = null;

    public void render() {
        if (messageProviderJsr == null) {
            throw new RuntimeException("You must set the property messageProviderJsr of class: "
                    + this.getClass().getName());
        }
        System.out.println(messageProviderJsr.getMessage());
    }

    public void setMessageProvider(MessageProviderJsr messageProvider) {
        this.messageProviderJsr = messageProvider;
    }

    public MessageProviderJsr getMessageProvider() {
        return this.messageProviderJsr;
    }
}
