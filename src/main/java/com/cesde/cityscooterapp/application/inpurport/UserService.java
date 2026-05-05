package com.cesde.cityscooterapp.application.inpurport;
import com.cesde.cityscooterapp.domain.User;

public interface UserService {

    User createUser(User user);

    User UpdateUser(User user);

    User GetUserById(int id);


}
