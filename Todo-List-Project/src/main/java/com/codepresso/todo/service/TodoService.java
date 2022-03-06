package com.codepresso.todo.service;

import java.util.List;

import com.codepresso.todo.mapper.TodoMapper;
import com.codepresso.todo.repository.TodoRepository;
import com.codepresso.todo.vo.Todo;
import org.springframework.stereotype.Service;

@Service // 서비스 어노테이션 추가, 스프링이 외부에서 객체로 만들어준다.
public class TodoService {

    private TodoMapper todoMapper; //todomapper 를 호출하도록 하기 위해 멤버변수 생성

    public TodoService(TodoMapper todomapper) { //의존성 주입을 위한 생성자 코드
        this.todoMapper = todomapper;
    }

    // bean 생성 , 멤버변수 만들고, 생성자 초기화 코드 작성해야함.
    //private List<Todo> todoList;  //bean으로 등록하고 있는 어레이 리스트 객체를 의존성 주입을 해야함

    private TodoRepository todoRepository; //새로 만든 todoRepository를 의존하도록 코드를 수정한다.

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    /*
    //todo 멤버 변수 todoList에 의존성 주입을 하기 위한 코드를 완성하세요 - 생성자 만들기!
    public TodoService(List<Todo> todoList) {
        this.todoList = todoList; //멤버변수 파라미터에 생성자로 들어온 객체를 참조하게끔 넣어준다.
    } //생성자를 활용해서 의존성 주입하는게 권장되는 방식이다.
    */


    public void addTodo(Todo todo) {
        //todo todoList에 새로운 항목을 추가하세요 - 어레이리스트 사용하기

        todo.setIsCompleted("N"); //새롭게 들어가는 todo는 작업을 완료하지 않기 떄문에 초기값 N
        todoRepository.save(todo); //전송하는 todo 객체를 save하기 위함
    }


    public List<Todo> getTodoList(){
        //todo todoList 정보들을 반환 하세요 - todoList 반환하기
        return todoRepository.findAll();
    }

    public void deleteTodo(int id) {
        //todo todoList에서 index에 해당하는 항목을 삭제하세요 - 리스트에서 엘레멘트를 삭제하는 메소드 적어주기
        todoRepository.deleteById(id);
    }


}
