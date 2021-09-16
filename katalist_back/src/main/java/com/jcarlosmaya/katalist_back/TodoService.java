package com.jcarlosmaya.katalist_back;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class TodoService implements interfaceServiciosTodo{
    @Autowired
    private TodoRepository repository;


    @Override
    public Iterable<Todo> get() {
        return repository.findAll();
    }

    @Override
    public Todo getById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public Todo save (Todo todo)
    {
        return repository.save(todo);
    }

    @Override
    public void delete(Long id) {
        if(repository.findById(id).isPresent())
            repository.deleteById(id);
        else
            throw new NoSuchElementException("No existe el elemento con el id pedido para eliminarlo");
    }

    @Override
    public Todo update(Todo todo) {
        if(repository.findById(todo.getId()).orElse(null) == null)
        {
            throw new NoSuchElementException("No existe el elemento con el id a actualizar");
        }
        return repository.save(todo);
    }

}
