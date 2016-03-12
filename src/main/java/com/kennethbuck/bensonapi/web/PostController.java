package com.kennethbuck.bensonapi.web;

import com.kennethbuck.bensonapi.domain.Post;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {

    @RequestMapping(method = RequestMethod.GET)
    public Post[] index() {
        return new Post[]{new Post(1, "Teaser", "Body", "Title")};
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Post show() {
        return new Post(1, "Teaser", "Body", "Title");
    }

    @RequestMapping(method = RequestMethod.POST)
    public void create() {

    }

    @RequestMapping(method = RequestMethod.PATCH)
    public void update() {

    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void delete() {

    }
}
