package com.example.demo.resource;

public class Greeting {
    private Long id;
    private String content;

    public Greeting(Long id, String content){
        this.id = id;
        this.content = content;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
