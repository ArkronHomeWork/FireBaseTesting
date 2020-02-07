package com.github.arkronzxc.firebasegetstarted.controller;

import com.github.arkronzxc.firebasegetstarted.model.UserModel;
import com.github.arkronzxc.firebasegetstarted.service.FirebaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
public class RestGetStartedController {

    @Autowired
    FirebaseService firebaseService;

    public RestGetStartedController(FirebaseService firebaseService) {
        this.firebaseService = firebaseService;
    }

    @GetMapping("/")
    public UserModel getUserInfo(@RequestHeader() String userName) {
        return new UserModel(userName, "", "");
    }

    @PostMapping("/")
    public String createUser(@RequestBody UserModel userModel) throws ExecutionException, InterruptedException {
        return firebaseService.saveUserDetails(userModel);
    }
}
