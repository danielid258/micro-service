package com.lewis.registry.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Daniel on 2018/11/15.
 *
 * 手动设置spring默认上下文的parent上下文
 *
 * {
 "contexts": {
         "application-1": {
         "beans": {},
         "parentId": "mycontext"
         },
         "mycontext": {
         "beans": {},
         "parentId": "bootstrap"
         },
         "bootstrap": {
         "beans": {},
         "parentId": null
         }
     }
 }
 
 */
@EnableAutoConfiguration
public class ApplicationContextPlus {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.setId("myContext");
        context.refresh();

        SpringApplicationBuilder builder = new SpringApplicationBuilder(ApplicationContextPlus.class);
        builder.parent(context).run(args);
    }
}
