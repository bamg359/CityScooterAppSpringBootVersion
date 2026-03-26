package com.cesde.cityscooterapp.repositories;

import com.cesde.cityscooterapp.domain.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    List<User> users = new ArrayList<>(

            new ArrayList<>()

    );


    public User save(User user){
        users.add(user);
        return user;
    }


}
