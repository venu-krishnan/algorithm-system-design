package com.showcase.spring.session;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HttpSessionConfig {

    @Bean
    public HttpSessionListener httpSessionListener() {
        return new HttpSessionListener() {
            @Override
            public void sessionCreated(HttpSessionEvent hse) {
                System.out.println(">>>> Session Created: " + hse.getSession());
            }

            @Override
            public void sessionDestroyed(HttpSessionEvent hse) {
                System.out.println(">>>> Session destroyed: " + hse.getSession());
            }
        };
    }
}
