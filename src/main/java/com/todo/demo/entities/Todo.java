package com.todo.demo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Document(collection = "Todos")
public class Todo {

    @Id
    private String id;
    private String title;

    public Todo(String title) {
        this.title = title;
    }
}
