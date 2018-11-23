package com.lewis.account.controller;

import com.lewis.account.domain.User;
import com.lewis.vo.ResultVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Daniel on 2018/11/23.
 */
@Slf4j
@RestController
public class AccountController {
    @PostMapping("/create")
    public ResultVO createNewAccount(User user) {
        log.info(String.valueOf(user));
        return null;
    }
}
