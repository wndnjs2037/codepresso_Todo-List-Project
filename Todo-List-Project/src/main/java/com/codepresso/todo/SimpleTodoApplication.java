package com.codepresso.todo;

import com.codepresso.todo.vo.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SimpleTodoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleTodoApplication.class, args);
    }

    @Bean //데이터를 저장할 곳이 필요해서 일부러 만든 부분
    public List<Todo> todoList() {
        return new ArrayList<>();
    } //어레이리스트 객체가 스프링에 의해 관리되고 있다.
}
