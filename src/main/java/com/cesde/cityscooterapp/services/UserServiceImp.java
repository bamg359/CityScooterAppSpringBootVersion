package com.cesde.cityscooterapp.services;

import com.cesde.cityscooterapp.domain.User;
import com.cesde.cityscooterapp.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
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
