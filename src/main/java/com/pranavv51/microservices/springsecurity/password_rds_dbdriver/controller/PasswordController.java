package com.pranavv51.microservices.springsecurity.password_rds_dbdriver.controller;


import com.pranavv51.microservices.springsecurity.password_rds_dbdriver.model.PasswordModel;
import com.pranavv51.microservices.springsecurity.password_rds_dbdriver.service.PasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "rds-driver/")
public class PasswordController {

    @Autowired
    private PasswordService passwordService;


    // http://localhost:8950/rds-driver/add-user/
    @PostMapping(value = "add-user/")
    public String adduserCredentialsToDb(@RequestBody PasswordModel userModel){
        return passwordService.saveUserWithCred(userModel);
    }

    // http://localhost:8950/rds-driver/fetch-user-cred/{}
    @GetMapping(value = "fetch-user-cred/{uname}")
    public PasswordModel fetchUser(@PathVariable("uname") String username){
        return passwordService.getUser(username);
    }


}
