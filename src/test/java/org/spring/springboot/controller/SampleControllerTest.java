package org.spring.springboot.controller;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

/**
 * @author: caishengzhi
 * @date: 2017-11-14 11:49
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleController.class)
@AutoConfigureMockMvc
public class SampleControllerTest {

//    testCompile("org.springframework.boot:spring-boot-starter-test")


    @Autowired
    private MockMvc mockMvc;

//    @Before
//    public void init() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new SampleController()).build();
//    }

    @Test
    public void getHello() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().string(equalTo("Greetings from Spring Boot!")));
    }


}
