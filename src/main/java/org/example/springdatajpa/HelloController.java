package org.example.springdatajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/hello")
    public String getHello() {
        return "Hello World";
    }

    @GetMapping("/")
    public String getHome() {
        List<Todo> todos = todoRepository.findAll();
        return "Welcome home";
    }

    @GetMapping("/test")
    public String getTest() {
        return "Mrinal....Chanda";
    }
}
