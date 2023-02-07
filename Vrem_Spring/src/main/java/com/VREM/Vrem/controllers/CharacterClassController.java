package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.CharacterClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.VREM.Vrem.repositories.CharacterClassRepository;

import java.util.List;

@RestController
public class CharacterClassController {

    @Autowired
    CharacterClassRepository characterClassRepository;

    @GetMapping(value = "/characterclasses")
    public ResponseEntity<List<CharacterClass>> getAllCharacterClasses(){
        return  new ResponseEntity<>(characterClassRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/characterclasses/{id}")
    public ResponseEntity getCharacterClass(@PathVariable Long id){
        return new ResponseEntity<>(characterClassRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/characterclasses")
    public ResponseEntity<CharacterClass> postCharacterClass(@RequestBody CharacterClass characterClass){
        characterClassRepository.save(characterClass);
        return new ResponseEntity<>(characterClass, HttpStatus.CREATED);
    }
}
