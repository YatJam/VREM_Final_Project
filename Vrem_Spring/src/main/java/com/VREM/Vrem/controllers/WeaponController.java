package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.Weapon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.VREM.Vrem.repositories.WeaponRepository;

import java.util.List;

@RestController
public class WeaponController {

    @Autowired
    WeaponRepository weaponRepository;

    @GetMapping(value = "/weapons")
    public ResponseEntity<List<Weapon>> getAllWeapons(){
        return  new ResponseEntity<>(weaponRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/weapons/{id}")
    public ResponseEntity getWeapon(@PathVariable Long id){
        return new ResponseEntity<>(weaponRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/weapons")
    public ResponseEntity<Weapon> postWeapon(@RequestBody Weapon weapon){
        weaponRepository.save(weapon);
        return new ResponseEntity<>(weapon, HttpStatus.CREATED);
    }

}
