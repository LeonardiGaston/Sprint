package com.example.sprint.repository;

import com.example.sprint.entity.UserSeller;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserSellerRepositoryImp implements IUserSellerRepository{

    List<UserSeller> sellerList = new ArrayList<>();

    public UserSellerRepositoryImp() {
        this.sellerList = loadListSeller();
    }

    private List<UserSeller> loadListSeller(){
        //LeerJson
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
