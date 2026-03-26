package com.hwl.KeepDoing.business.todo.repository;

import com.hwl.KeepDoing.business.todo.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}