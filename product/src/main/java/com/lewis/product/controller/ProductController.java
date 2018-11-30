package com.lewis.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Daniel on 2018/11/30.
 */
@RestController
public class ProductController {
    @GetMapping("")
    public String list() {
        return "product";
    }
}
