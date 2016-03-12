package com.kennethbuck.bensonapi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping("/api/posts")
    public String home() {
        return "api/posts";
    }
}
