package com.kennethbuck.bensonapi.domain;

/**
 * Created by kennethbuck on 2016-03-12.
 */
public class Post {

    private final long id;

    /**
     *
     */
    private final String teaser;

    /**
     *
     */
    private final String body;

    /**
     *
     */
    private final String title;

    /**
     *
     * @param id
     * @param teaser
     * @param body
     * @param title
     */
    public Post(long id, String teaser, String body, String title) {
        this.id = id;
        this.teaser = teaser;
        this.body = body;
        this.title = title;
    }

    public long getId() {
        return id;
    }

    public String getTeaser() {
        return teaser;
    }

    public String getBody() {
        return body;
    }

    public String getTitle() {
        return title;
    }
}
