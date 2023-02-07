package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.VREM.Vrem.repositories.ItemRepository;

import java.util.List;

@RestController
public class ItemController {
    @Autowired
    ItemRepository itemRepository;

    @GetMapping(value = "/items")
    public ResponseEntity<List<Item>> getAllItems(){
        return  new ResponseEntity<>(itemRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/items/{id}")
    public ResponseEntity getItem(@PathVariable Long id){
        return new ResponseEntity<>(itemRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/items")
    public ResponseEntity<Item> postItem(@RequestBody Item item){
        itemRepository.save(item);
        return new ResponseEntity<>(item, HttpStatus.CREATED);
    }

}
