package com.getfire.spring.ch4.jsr330;

import javax.inject.Inject;
import javax.inject.Named;

@Named("messageProviderJsr")
public class ConfigurableMessageProviderJsr implements MessageProviderJsr {
    private String message = "Default message";

    public ConfigurableMessageProviderJsr() {
    }

    @Inject
    @Named("message")
    public ConfigurableMessageProviderJsr(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
