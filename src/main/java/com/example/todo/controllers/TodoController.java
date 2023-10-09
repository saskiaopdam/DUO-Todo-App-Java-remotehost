package com.example.todo.controllers;

import com.example.todo.model.Todo;
import com.example.todo.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class TodoController {

    @Autowired
    TodoService todoService;

    // Create
    @PostMapping("/todo")
    Todo addTodo(@RequestBody Todo todo) {
        return todoService.save(todo);
    }

    // Read - all
    @GetMapping("/todo")
    Iterable<Todo> getTodos() {
        return todoService.findAll();
    }

    // Read - by id
    @GetMapping("/todo/{id}")
    Optional<Todo> getTodo(@PathVariable int id) {
        return todoService.findById(id);
    }

    // Update
    @PutMapping("/todo/{id}")
    Todo updateTodo(@PathVariable int id, @RequestBody Todo todo) {
        return todoService.save(todo);
    }

    // Delete
    @DeleteMapping("/todo/{id}")
    void deleteTodo(@PathVariable int id) {
        todoService.deleteById(id);
    }
}
