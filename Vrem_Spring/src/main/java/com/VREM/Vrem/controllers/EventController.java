package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.Event;
import com.VREM.Vrem.models.Item;
import com.VREM.Vrem.repositories.EventRepository;
import com.VREM.Vrem.repositories.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventRepository eventRepository;

    @GetMapping(value = "/events")
    public ResponseEntity<List<Event>> getAllIEvents(){
        return  new ResponseEntity<>(eventRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/events/{id}")
    public ResponseEntity getEvent(@PathVariable Long id){
        return new ResponseEntity<>(eventRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/events")
    public ResponseEntity<Event> postEvents(@RequestBody Event event){
        eventRepository.save(event);
        return new ResponseEntity<>(event, HttpStatus.CREATED);
    }
}
