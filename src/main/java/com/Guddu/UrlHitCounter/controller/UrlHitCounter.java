package com.Guddu.UrlHitCounter.controller;

import com.Guddu.UrlHitCounter.model.User;
import com.Guddu.UrlHitCounter.service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UrlHitCounter {
@Autowired
    UrlHitService urlHitService;
    @GetMapping("User/{U}")
    public String Urlhit(@PathVariable User U){
        return UrlHitService.urlHitCounts(U);
    }

    @PostMapping("User/add")
    public String addUser(User U){
        return urlHitService.addUser(U);

    }
    @GetMapping("users")  //getAllUser
    public List<User> getAllUsers()
    {
        return UrlHitService.getAllUser();
    }

}
