// 이 파일은 동영상 강의에서 만든 부분! 리파지토리와 내용설계는 동일하다.
package com.codepresso.todo.mapper;

import com.codepresso.todo.vo.Todo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TodoMapper {
    void save(@Param("todo") Todo todo);
}
