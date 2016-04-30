package com.kennethbuck.bensonapi.web;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MockServletContext.class)
@WebAppConfiguration
public class PostControllerTest {

    private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        mvc = MockMvcBuilders.standaloneSetup(new PostController()).build();
    }

    @Test
    public void getPosts() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/posts")
                .accept("application/vnd.api+json"))
                .andExpect(status().isOk());
    }

    @Test
    public void getPost() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/api/posts/1")
                .accept("application/vnd.api+json"))
                .andExpect(status().isOk());
    }
}