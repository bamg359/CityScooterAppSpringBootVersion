package com.cesde.cityscooterapp.services;
import com.cesde.cityscooterapp.domain.User;

public interface UserService {

    User createUser(User user);

    User UpdateUser(User user);

    User GetUserById(int id);


}
