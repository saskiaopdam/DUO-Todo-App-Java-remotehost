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
                "<p>You are looking at the backend.<p>" +
                "<li>Backend url: https://duo-todo-app-java-5b713e6535ff.herokuapp.com/</li>" +
                "<li>Frontend url: https://duo-todo-app-angular-88e1837166f5.herokuapp.com/</li>" +
                "<p>Add /todo to the url to see the backend at /todo endpoint.<p>";
    }
}
