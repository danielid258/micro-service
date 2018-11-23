package com.lewis.account.domain;

import lombok.Data;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

/**
 * Daniel on 2018/11/23.
 */
@Data
public class User {
    /**
     *
     */
    @NotNull
    @Length(min = 3, max = 20)
    private String username;

    /**
     *
     */
    @NotNull
    @Length(min = 6, max = 40)
    private String password;
}
