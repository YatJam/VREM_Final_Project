package com.VREM.Vrem.controllers;

import com.VREM.Vrem.models.Enemy;
import com.VREM.Vrem.models.User;
import com.VREM.Vrem.repositories.EnemyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EnemyController {

    @Autowired
    EnemyRepository enemyRepository;

    @GetMapping(value = "/enemies")
    public ResponseEntity<List<Enemy>> getAllEnemies(){
        return  new ResponseEntity<>(enemyRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/enemies/{id}")
    public ResponseEntity getEnemy(@PathVariable Long id){
        return new ResponseEntity<>(enemyRepository.findById(id), HttpStatus.OK);
    }

    @PostMapping(value = "/enemies")
    public ResponseEntity<Enemy> postEnemy(@RequestBody Enemy enemy){
        enemyRepository.save(enemy);
        return new ResponseEntity<>(enemy, HttpStatus.CREATED);
    }

    @PutMapping(value = "/enemies/{id}")
    public Enemy updateUser(@RequestBody Enemy newEnemy, @PathVariable Long id){

        return enemyRepository.findById(id)
                .map(enemy -> {
                    enemy.setEnemyType(newEnemy.getEnemyType());
                    enemy.setEnemyHealth(newEnemy.getEnemyHealth());
                    enemy.setEnemyDamage(newEnemy.getEnemyDamage());
                    enemy.setEnemyBattlecry(newEnemy.getEnemyBattlecry());
                    return enemyRepository.save(enemy);
                })
                .orElseGet(() ->{
                    newEnemy.setId(id);
                    return enemyRepository.save(newEnemy);
                });
    }
}
