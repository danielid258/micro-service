package com.lewis.account.controller;

import com.lewis.account.properties.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Daniel on 2018/11/21.
 */
@RestController
public class IndexController {
    @Autowired
    private Properties properties;

    @GetMapping("/name")
    public String  getPropertyName() {
        return properties.getName();
    }
}
