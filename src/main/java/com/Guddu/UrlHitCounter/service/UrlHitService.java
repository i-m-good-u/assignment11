package com.Guddu.UrlHitCounter.service;

import com.Guddu.UrlHitCounter.model.User;
import com.Guddu.UrlHitCounter.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

import static javax.swing.text.html.HTML.Tag.U;

@Service
public class UrlHitService {

    @Autowired
    static
    UserRepo userRepo;
    public static List<User> getAllUser(){
        return userRepo.getUsers();
    }


@GetMapping("user/{userName}")
    public static String urlHitCounts(User u) {
    int count=0;
    count=count+1;
        return u.getUserName();

    }


    public String addUser(User u) {
        List<User> userList=getAllUser();
        userList.add(u);

        return "user added";
    }
}
