package com.example.demo.module.login;

import com.example.demo.model.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private Loginservice loginService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public List<user> LoginController(//            @RequestParam(value = "User_Id", required = false) String Id,
//            @RequestParam(value = "Password", required = false) String Password
        ) {

            return loginService.login();
    }

}
