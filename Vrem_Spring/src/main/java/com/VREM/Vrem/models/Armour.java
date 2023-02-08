package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "armours")
public class Armour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "armour_type")
    private String armourType;

    @Column(name = "armour_defense")
    private int armourDefense;

    @JsonIgnoreProperties
    @OneToMany
    @JoinColumn(name = "user_id")
    private List<User> users;
    public Armour(String armourType, int armourDefense) {
        this.armourType = armourType;
        this.armourDefense = armourDefense;
        this.users = new ArrayList<>();
    }

    public Armour() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }

    public int getArmourDefense() {
        return armourDefense;
    }

    public void setArmourDefense(int armourDefense) {
        this.armourDefense = armourDefense;
    }

    public List<User> getUser() {
        return users;
    }

    public void setUser(List<User> user) {
        this.users = user;
    }
}
