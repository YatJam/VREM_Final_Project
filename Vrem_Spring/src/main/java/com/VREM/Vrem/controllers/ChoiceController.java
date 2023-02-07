package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.Choice;
import com.VREM.Vrem.models.Item;
import com.VREM.Vrem.repositories.ChoiceRepository;
import com.VREM.Vrem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ChoiceController {

    @Autowired
    ChoiceRepository choiceRepository;

    @GetMapping(value = "/choices")
    public ResponseEntity<List<Choice>> getAllChoices(){
        return  new ResponseEntity<>(choiceRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/choices/{id}")
    public ResponseEntity getChoice(@PathVariable Long id){
        return new ResponseEntity<>(choiceRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/choices")
    public ResponseEntity<Choice> postItem(@RequestBody Choice choice){
        choiceRepository.save(choice);
        return new ResponseEntity<>(choice, HttpStatus.CREATED);
    }
}
