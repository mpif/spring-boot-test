package org.spring.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: caishengzhi
 * @date: 2017-11-14 11:34
 **/
@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/user")
    @ResponseBody
    String queryUser() {
        return "Hello World!2222";
    }

}


