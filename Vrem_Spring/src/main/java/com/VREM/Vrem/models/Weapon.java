package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "weapons")
public class Weapon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "weapon_type")
    private String weaponType;

    @Column(name = "weapon_damage")
    private int weaponDamage;

    @JsonIgnoreProperties
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> users;

    public Weapon(String weaponType, int weaponDamage) {
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
        this.users = new ArrayList<>();
    }

    public Weapon() {
    }

    public String getWeaponType() {
        return weaponType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public List<User> getUser() {
        return users;
    }

    public void setUser(List<User> user) {
        this.users = user;
    }
}
