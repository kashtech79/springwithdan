package com.kash.config;

import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringgitProperties {
    private String welcomeMsg = "Hello, World";

    public String getWelcomeMsg(){
        return welcomeMsg;
    }

    public void setWelcomeMsg(String welcomeMsg){
        this.welcomeMsg = welcomeMsg;
    }
}
