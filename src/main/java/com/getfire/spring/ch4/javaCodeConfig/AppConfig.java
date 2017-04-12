package com.getfire.spring.ch4.javaCodeConfig;

import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.ConfigurableMessageProvider;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.MessageProvider;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.MessageRenderer;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.StandartOutMessageRenderer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public MessageProvider messageProvider1() {
        System.out.println("call messageProvider1 bean");
        return new ConfigurableMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer1() {
        System.out.println("call messageRenderer1");
        MessageRenderer renderer = new StandartOutMessageRenderer();
        renderer.setMessageProvider(messageProvider1());
        return renderer;
    }
}
