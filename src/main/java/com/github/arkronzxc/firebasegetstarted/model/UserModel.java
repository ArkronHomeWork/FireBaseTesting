package com.github.arkronzxc.firebasegetstarted.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class UserModel {

    private String userName;
    private String password;
    private String email;


}
