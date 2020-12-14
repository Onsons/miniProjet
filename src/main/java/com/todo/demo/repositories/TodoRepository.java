package com.todo.demo.repositories;

import com.todo.demo.entities.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository  extends MongoRepository<Todo, String> {
}
