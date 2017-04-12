package com.getfire.spring.ch4.javaCodeConfig;

import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.ConfigurableMessageProvider;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.MessageProvider;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.MessageRenderer;
import com.getfire.spring.ch4.javaCodeConfig.exampleFromCh3.StandartOutMessageRenderer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ImportResource(value = "classpath:ch3/parent.xml")
@Import(AppConfig.class)
@PropertySource(value = "classpath:message.properties")
@ComponentScan(basePackages = {"com.getfire.spring.ch4"})
@EnableTransactionManagement
public class AppConfigVer2 {
    @Autowired
    Environment env;

    @Bean
    @Lazy(value = true)
    public MessageProvider messageProvider() {
        ConfigurableMessageProvider provider = new ConfigurableMessageProvider();
        provider.setMessage(env.getProperty("message"));
        return provider;
    }

    @Bean(name = "messageRenderer")
    @Scope(value = "prototype")
    @DependsOn(value = "messageProvider")
    public MessageRenderer messageRenderer() {
        MessageRenderer renderer = new StandartOutMessageRenderer();
        renderer.setMessageProvider(messageProvider());
        return renderer;
    }
}
