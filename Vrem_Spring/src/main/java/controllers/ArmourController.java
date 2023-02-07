package controllers;

import models.Armour;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repositories.ArmourRepository;

import java.util.List;

@RestController
public class ArmourController {


    @Autowired
    ArmourRepository armourRepository;

    @GetMapping(value = "/armours")
    public ResponseEntity<List<Armour>> getAllArmours(){
        return  new ResponseEntity<>(armourRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/armours/{id}")
    public ResponseEntity getArmour(@PathVariable Long id){
        return new ResponseEntity<>(armourRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/armours")
    public ResponseEntity<Armour> postArmour(@RequestBody Armour armour){
        armourRepository.save(armour);
        return new ResponseEntity<>(armour, HttpStatus.CREATED);
    }
}

