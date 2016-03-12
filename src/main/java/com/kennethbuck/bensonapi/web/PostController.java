package com.kennethbuck.bensonapi.web;

import com.kennethbuck.bensonapi.domain.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @RequestMapping("/api/posts")
    public Post[] index() {
        return new Post[]{new Post(1, "Teaser", "Body", "Title")};
    }
}
