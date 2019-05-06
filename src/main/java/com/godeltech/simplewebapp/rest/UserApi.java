package com.godeltech.simplewebapp.rest;

import com.godeltech.simplewebapp.domain.User;
import com.godeltech.simplewebapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping("/getAllUser")
    private List<User> getAllUser(){
        return userService.getAllUser();
    }

    @GetMapping("/getUserById/{id}")
    private User getUserById(@PathVariable Long id){
        return userService.find(id);
    }

    @PostMapping("/postUser")
    private void postUser(@RequestBody User user ){
        userService.save(user);
    }

    @DeleteMapping("/deleteUser/{id}")
    private ResponseEntity deleteEmployeeById(@PathVariable Long id){
        System.out.println(id);
        userService.delete(id);
        return ResponseEntity.ok().build();
    }
}