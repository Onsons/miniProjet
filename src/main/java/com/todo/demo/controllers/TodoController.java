package com.todo.demo.controllers;

import com.todo.demo.entities.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.todo.demo.repositories.TodoRepository;

import java.util.List;

@RestController
public class TodoController {

    @Autowired
    private TodoRepository todoRepository;

    @PostMapping("/todo")
    public Todo save(@RequestBody Todo todo) {
        return  todoRepository.save(todo);
    }
    @GetMapping("/todo")
    public List<Todo> getAll() {
        return todoRepository.findAll();
    }
}
