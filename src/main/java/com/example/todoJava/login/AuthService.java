package com.example.todoJava.login;

import org.springframework.stereotype.Service;

@Service
public class AuthService {
    public boolean auth(String username,String password){
        boolean isValid = username.equals("boss") & password.equals("boss");
        return isValid;
    }
}
