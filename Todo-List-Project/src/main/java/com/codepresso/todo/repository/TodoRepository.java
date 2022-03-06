// 이 파일은 오프라인 수업때 만든 부분!
package com.codepresso.todo.repository;

import com.codepresso.todo.vo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper //매퍼는 해당 인터페이스가 호출될 때 실행되도록 만들어준다.
public interface TodoRepository {
    void save(@Param("todo") Todo todo);
    List<Todo> findAll();
    void deleteById(@Param("id") Integer id);
}
