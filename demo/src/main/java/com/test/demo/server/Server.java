package com.test.demo.server;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;

public class Server implements WebServerFactoryCustomizer< ConfigurableWebServerFactory >{
    @Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(9000);
    }

}
