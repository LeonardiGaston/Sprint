package com.example.sprint.repository;

public interface ICRUDRepository<T> {
    void create(T t);
    void read(T t);
    void update(T t);
    void delete(T t);
}
