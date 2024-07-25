package com.pranavv51.microservices.springsecurity.password_rds_dbdriver.repository;

import com.pranavv51.microservices.springsecurity.password_rds_dbdriver.model.PasswordModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PasswordRepo extends JpaRepository<PasswordModel,Long> {

    public PasswordModel findByUsername(String Username);
}
