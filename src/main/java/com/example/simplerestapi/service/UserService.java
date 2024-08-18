package com.example.simplerestapi.service;

import com.example.simplerestapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class UserService {
    ArrayList<User> userList = new ArrayList<>();
    public UserService() {

        User user1 = new User(1,"Ida", 32, "ida@mail.com");
        User user2 = new User(2,"Hans", 26, "hans@mail.com");
        User user3 = new User(3,"Lars", 45, "lars@mail.com");
        User user4 = new User(4,"Ben", 32, "ben@mail.com");
        User user5 = new User(5,"Eva", 59, "eva@mail.com");
        userList.addAll(Arrays.asList(user1, user2, user3, user4, user5));
    }
    public User getUser(int id) {
        for (User user: userList){
            if(user.getId() == id){
                return user;
            }
        }
        return null;
    }
}
