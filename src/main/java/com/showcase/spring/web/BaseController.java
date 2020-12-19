package com.showcase.spring.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BaseController
 */
@RestController
public class BaseController {

    @Autowired
    private BaseService baseService;

    @GetMapping("/employees")
    private String get() {

        return null;
    }

}
