package com.cesde.cityscooterapp.application;

import com.cesde.cityscooterapp.application.inpurport.UserService;
import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.infrastructure.out.adapter.UserRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {

    private final UserRepositoryImpl userRepositoryImpl;

    public UserServiceImp(UserRepositoryImpl userRepositoryImpl) {
        this.userRepositoryImpl = userRepositoryImpl;
    }



    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public User UpdateUser(User user) {
        return null;
    }

    @Override
    public User GetUserById(int id) {
        return null;
    }


}
