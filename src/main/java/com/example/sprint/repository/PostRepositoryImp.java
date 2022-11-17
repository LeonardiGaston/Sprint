package com.example.sprint.repository;

import com.example.sprint.entity.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostRepositoryImp implements IPostRepositry{
    List<Post> postList = new ArrayList<>();

    public PostRepositoryImp(){
        this.postList = loadListPost();
    }

    private List<Post> loadListPost(){
        //Leer Json
        return null;
    }

    @Override
    public void create(Object o) {

    }

    @Override
    public void read(Object o) {

    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void delete(Object o) {

    }
}
