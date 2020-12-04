package com.todo.demo.repositories;

import com.todo.demo.entities.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface TodoRepository  extends MongoRepository<Todo, String> {
}
