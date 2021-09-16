package com.jcarlosmaya.katalist_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api")
public class TodoController {

    @Autowired
    private TodoService service;

    @GetMapping(value = "/todos")
    public Iterable<Todo> get(){
        return service.get();
    }

    @GetMapping(value = "/todo/{id}")
    public Todo getById(@PathVariable Long id)
    {
        return service.getById(id);
    }

    @PostMapping (value = "/todo")
    public Todo save(@RequestBody Todo todo){
        return service.save(todo);
    }

    @DeleteMapping(value = "/todo/{id}")
    public void delete(@PathVariable("id") Long id){
        service.delete(id);
    }

    @PutMapping(value = "/todo")
    public Todo update(@RequestBody Todo todo){
        return service.update(todo);
    }
}
