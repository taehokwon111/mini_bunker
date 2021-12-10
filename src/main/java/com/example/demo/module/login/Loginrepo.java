package com.example.demo.module.login;


import com.example.demo.model.user;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface Loginrepo {

    List<user> findUsers();


}
