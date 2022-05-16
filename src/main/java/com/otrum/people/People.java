package com.otrum.people;

public class People {

    private final long id;
    private final String content;

    public People(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
