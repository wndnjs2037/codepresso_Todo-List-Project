package com.codepresso.todo.controller;

import java.util.List;

import com.codepresso.todo.service.TodoService;
import com.codepresso.todo.vo.ResultDto;
import com.codepresso.todo.vo.Todo;
import org.springframework.web.bind.annotation.*;

@RestController
public class TodoController {

    //todo TodoService를 활용하기 위해 의존성 주입 코드를 작성하세요
    private TodoService todoService; //객체를 생성한 후

    public TodoController(TodoService todoService) { // 생성자를 만들어주면 스프링이 객체를 만들어준다.
        this.todoService = todoService;
    }

    //todo API문서를 확인하여 GET /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @GetMapping(value = "/todo")
    public List<Todo> getTodoList(){
        List<Todo> list=todoService.getTodoList(); //원소가 몇개가 있든 리턴해서 그대로 내보내주면 된다.
        return list;
        // 또는 return List<Todo> list=getTodoList(); 도 가능하다.
    }

    //todo API문서를 확인하여 POST /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @PostMapping(value = "/todo")
    public ResultDto addTodo(@RequestBody Todo todo) { //json을 간이파라미터로 받아야 하므로 어노테이션 설정
        todoService.addTodo(todo); //들어온 값을 add로 todo에 추가해준다.
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success"); //
    }

    //todo API문서를 확인하여 DELETE /todo REST API를 완성하세요
    //todo TodoService를 활용하세요
    @DeleteMapping(value = "/todo/{id}")
    public ResultDto deleteTodo(@PathVariable("id") Integer id) {
        todoService.deleteTodo(id); //delete메소드에 id를 파라미터로 넣어 실행한다.
        //todo return code는 변경하지 마세요
        return new ResultDto(200, "Success");
    }

}
