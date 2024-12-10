package com.todolist.todolist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.todolist.todolist.model.Task;

public interface TaskRepository extends JpaRepository<Task,Long>{

}
