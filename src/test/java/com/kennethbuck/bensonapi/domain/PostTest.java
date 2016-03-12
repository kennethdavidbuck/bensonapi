package com.kennethbuck.bensonapi.domain;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by kennethbuck on 2016-03-12.
 */
public class PostTest {

    private Post post;

    @Before
    public void setUp() throws Exception {
        this.post = new Post(1, "A Teaser", "Body", "Title");
    }

    @After
    public void tearDown() throws Exception {
        this.post = null;
    }

    @Test
    public void testGetId() throws Exception {
        assertEquals(post.getId(), 1);
    }

    @Test
    public void testGetTeaser() throws Exception {
        assertEquals(post.getTeaser(), "A Teaser");
    }

    @Test
    public void testGetBody() throws Exception {
        assertEquals(post.getBody(), "Body");
    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals(post.getTitle(), "Title");
    }
}