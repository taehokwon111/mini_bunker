package com.example.demo.module.login;

import com.example.demo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Loginservice {

//    List<user> login(String Id, String Password){
//
//        return null;
//
//    }

    @Autowired
    private Loginrepo loginrepo;

    List<user> login(){

        return loginrepo.findUsers();

    }

}
