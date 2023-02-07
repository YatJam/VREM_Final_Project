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

//    @OneToMany(mappedBy = "users")
//    @JsonManagedReference
//    private List<User> user;

    public Weapon(String weaponType, int weaponDamage) {
        this.weaponType = weaponType;
        this.weaponDamage = weaponDamage;
//        this.user = new ArrayList<>();
    }

    public Weapon() {
    }

    public String getWeaponType() {
        return weaponType;
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

//    public List<User> getUser() {
//        return user;
//    }
//
//    public void setUser(List<User> user) {
//        this.user = user;
//    }
}
