package com.jcarlosmaya.katalist_back;

import java.util.List;

public interface interfaceServiciosTodo {
    Iterable<Todo> get();
    Todo getById(Long id);
    Todo save(Todo todo);
    void delete(Long id);
    Todo update(Todo persona);
}
