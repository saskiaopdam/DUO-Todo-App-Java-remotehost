package com.example.todo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<h1>Todo App API</h1>" +

                "<h2><li><a href=https://duo-todo-app-java-5b713e6535ff.herokuapp.com/todo>Backend: /todo</a></li>" +
                "<h2><li><a href=https://duo-todo-app-java-5b713e6535ff.herokuapp.com/todo/1>Backend: /todo/{id}</a></li>" +

                "<h2><li><a href=https://duo-todo-app-angular-88e1837166f5.herokuapp.com/>Frontend: all CRUD</a></li></h2>";
    }
}
