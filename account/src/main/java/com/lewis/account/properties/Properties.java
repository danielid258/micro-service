package com.lewis.account.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

/**
 * Daniel on 2018/11/21.
 */
@Data
@Component
@RefreshScope
@ConfigurationProperties(prefix = "lewis")
public class Properties {
    private String name;
    private Integer age;
}
