package com.getfire.spring.ch3.annotation;

import com.getfire.spring.ch3.messageProvider.MessageProvider;
import com.getfire.spring.ch3.messageProvider.MessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messageRenderer")
public class StandartOutMessageRenderer  implements MessageRenderer {

    private MessageProvider messageProvider;

    public void render() {
        if (messageProvider == null) {
            throw new RuntimeException(
                    "You must set the property messageProvider of class: "
                            + com.getfire.spring.ch3.messageProvider.StandartOutMessageRenderer.class.getName());
        }
        System.out.println(messageProvider.getMessage());

    }
@Autowired
    public void setMessageProvider(MessageProvider provider) {
        this.messageProvider = provider;
    }

    public MessageProvider getMessageProvider() {
        return this.messageProvider;
    }
}

