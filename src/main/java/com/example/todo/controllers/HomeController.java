package com.example.todo.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
    @GetMapping("/")
    public String home() {
        return "<h1>Welcome to the Todo App</h1>" +
                "<h2>This is the backend: https://duo-todo-app-java-5b713e6535ff.herokuapp.com/</h>" +
                "<h2>This is the frontend: https://duo-todo-app-angular-88e1837166f5.herokuapp.com/</h>" +
                "<p>Add /todo to the url to see the backend at /todo endpoint.<p>";
    }
}
