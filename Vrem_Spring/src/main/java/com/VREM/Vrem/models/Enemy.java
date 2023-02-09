package com.VREM.Vrem.models;

import javax.persistence.*;

@Entity
@Table(name = "enemies")
public class Enemy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "enemy_type")
    private String enemyType;

    @Column(name = "enemy_health")
    private int enemyHealth;

    @Column(name = "enemy_damage")
    private int enemyDamage;

    @Column(name = "enemy_battlecry")
    private String enemyBattlecry;

    public Enemy(String enemyType, int enemyHealth, int enemyDamage, String enemyBattlecry) {
        this.enemyType = enemyType;
        this.enemyHealth = enemyHealth;
        this.enemyDamage = enemyDamage;
        this.enemyBattlecry = enemyBattlecry;
    }

    public Enemy() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(String enemyType) {
        this.enemyType = enemyType;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    public int getEnemyDamage() {
        return enemyDamage;
    }

    public void setEnemyDamage(int enemyDamage) {
        this.enemyDamage = enemyDamage;
    }

    public String getEnemyBattlecry() {
        return enemyBattlecry;
    }

    public void setEnemyBattlecry(String enemyBattlecry) {
        this.enemyBattlecry = enemyBattlecry;
    }
}
