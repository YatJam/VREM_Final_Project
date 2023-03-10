package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.VREM.Vrem.repositories.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers(){
        return  new ResponseEntity<>(userRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity getUser(@PathVariable Long id){
        return new ResponseEntity<>(userRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> postUser(@RequestBody User user){
        userRepository.save(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping(value = "/users/{id}")
    public User updateUser(@RequestBody User newUser, @PathVariable Long id){

        return userRepository.findById(id)
                .map(user -> {
                    user.setPlayerName(newUser.getPlayerName());
                    user.setCharacterClass(newUser.getCharacterClass());
                    user.setPlayerArmour(newUser.getPlayerArmour());
                    user.setPlayerWeapon(newUser.getPlayerWeapon());
                    return userRepository.save(user);
                })
                .orElseGet(() ->{
                    newUser.setId(id);
                    return userRepository.save(newUser);
                });
    }

    @DeleteMapping(value = "/users/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        return "delete has been called";
    }

}
