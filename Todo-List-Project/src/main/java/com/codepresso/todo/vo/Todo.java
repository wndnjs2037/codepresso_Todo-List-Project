package com.codepresso.todo.vo;

public class Todo { //todo 객체를 리스트형태로 응답하면 JSON 응답 예시처럼 가능함
    private Integer id;
    private String content;
    private String isCompleted;

    public Todo() {
    }

    public Todo(String content) {
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIsCompleted() {
        return isCompleted;
    }

    public void setIsCompleted(String isCompleted) {
        this.isCompleted = isCompleted;
    }
}
