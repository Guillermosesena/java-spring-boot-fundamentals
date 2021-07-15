package com.fundamentos.springboot.fundamentos.controller;

import com.fundamentos.springboot.fundamentos.caseuse.GetUser;
import com.fundamentos.springboot.fundamentos.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserRestController {
    //create, get, delete, update

    ///Siempre cuidad que este la dependencia, puede ser autowired o puede ser en el contrusctot
    @Autowired
    private GetUser getUser;

    @GetMapping("/")
    List<User> get(){
        return getUser.getAll();
    }
}
