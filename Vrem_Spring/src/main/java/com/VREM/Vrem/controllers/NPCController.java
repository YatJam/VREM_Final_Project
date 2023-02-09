package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.NPC;
import com.VREM.Vrem.repositories.NPCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class NPCController {

    @Autowired
    NPCRepository npcRepository;

    @GetMapping(value = "/npcs")
    public ResponseEntity<List<NPC>> getAllNPCs(){
        return  new ResponseEntity<>(npcRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/npcs/{id}")
    public ResponseEntity getNPC(@PathVariable Long id){
        return new ResponseEntity<>(npcRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/npcs")
    public ResponseEntity<NPC> postEnemy(@RequestBody NPC npc){
        npcRepository.save(npc);
        return new ResponseEntity<>(npc, HttpStatus.CREATED);
    }

    @PutMapping(value = "/npcs/{id}")
    public NPC updateUser(@RequestBody NPC newNpc, @PathVariable Long id){

        return npcRepository.findById(id)
                .map(npc -> {
                    npc.setNpcName(newNpc.getNpcName());
                    npc.setNpcHealth(newNpc.getNpcHealth());
                    npc.setNpcDamage(newNpc.getNpcDamage());
                    npc.setNpcBattlecry(newNpc.getNpcBattlecry());
                    return npcRepository.save(npc);
                })
                .orElseGet(() ->{
                    newNpc.setId(id);
                    return npcRepository.save(newNpc);
                });
    }
}
