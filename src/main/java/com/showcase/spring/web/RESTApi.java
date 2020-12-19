package com.showcase.spring.web;

import com.showcase.spring.session.SpringSessionConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.reactive.WebFluxAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpSession;


@RestController
public class RESTApi {

    Logger logger = LoggerFactory.getLogger(RESTApi.class);

    @Autowired
    private HttpSession httpSession;

    @GetMapping("/")
    public String helloWorld(HttpSession session) {
        logger.info(">>>> hello world logger slfj");
//        System.out.println(">>>> session: " + session.getId());
//        System.out.println(">>>> session getMaxInactiveInterval: " + session.getMaxInactiveInterval());
//        System.out.println(">>>> session isNew: " + session.isNew());
//        System.out.println(">>>> SpringSessionConfig.concurrentHashMap: " + SpringSessionConfig.concurrentHashMap);
//        return "hello world session:" + session.getId();
        return "hello world session";
    }

    @GetMapping("/rest")
    public String helloWorldWithRequestAttr(@RequestParam(value="name") String name) {
        return "hello world " + name;
    }
}
