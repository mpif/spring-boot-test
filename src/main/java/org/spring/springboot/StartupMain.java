package org.spring.springboot;

import org.spring.springboot.controller.SampleController;
import org.springframework.boot.SpringApplication;

/**
 * @author: caishengzhi
 * @date: 2017-11-14 11:36
 **/
public class StartupMain {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleController.class, args);
    }

}
