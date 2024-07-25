package com.pranavv51.microservices.springsecurity.password_rds_dbdriver.service;


import com.pranavv51.microservices.springsecurity.password_rds_dbdriver.model.PasswordModel;
import com.pranavv51.microservices.springsecurity.password_rds_dbdriver.repository.PasswordRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    private Logger logger = LoggerFactory.getLogger(PasswordService.class);

    @Autowired
    private PasswordRepo passwordRepo;


    public String saveUserWithCred(PasswordModel userModel){
        passwordRepo.save(userModel);
        return userModel.toString();
    }

    public PasswordModel getUser(String name){
        var ret = passwordRepo.findByUsername(name);
        logger.info("Fetched the record(called by other microservice) For username :- "+ret.getUsername());
        if(ret==null){
            return null;
        }
        return ret;
    }
}
