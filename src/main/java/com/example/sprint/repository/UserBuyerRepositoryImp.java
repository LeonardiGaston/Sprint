package com.example.sprint.repository;

import com.example.sprint.entity.UserBuyer;
import com.example.sprint.entity.UserSeller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserBuyerRepositoryImp implements IUserBuyerRepository{
    List<UserBuyer> buyerList = new ArrayList<>();

    public UserBuyerRepositoryImp() {
        this.buyerList = loadListBuyer();
    }

    private List<UserBuyer> loadListBuyer(){
        //Leer Json
        return null;
    };

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
