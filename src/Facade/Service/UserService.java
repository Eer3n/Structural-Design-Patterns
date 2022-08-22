package Facade.Service;

import Facade.Entity.User;

public class UserService {

    public User findById(Long id) {
        User user = new User();
        user.setId(id);
        return user;
    }

    public User maskUSerMailAddress(User user) {
        /**
         * elif.eren@gmail.com -> e....e...@gmail.com
         * */
        //logic buraya kurulmalı!!!
        return user;
    }
}
