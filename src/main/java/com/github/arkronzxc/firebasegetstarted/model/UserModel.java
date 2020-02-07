package com.github.arkronzxc.firebasegetstarted.model;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UserModel {

    private String userName;
    private String password;
    private String email;

    public UserModel() {
    }

    public UserModel(String userName, String password, String email) {
        userName = this.userName;
        password = this.password;
        email = this.email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
