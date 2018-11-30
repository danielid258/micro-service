package com.lewis.payment.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Daniel on 2018/11/30.
 */
@RestController
public class PaymentController {
    @GetMapping("")
    public String list() {
        return "payment";
    }
}
