package com.cesde.cityscooterapp.infrastructure.out.adapter;

import com.cesde.cityscooterapp.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepositoryImpl {

    List<User> users = new ArrayList<>(

            new ArrayList<>()

    );


    public User save(User user){
        users.add(user);
        return user;
    }


}
