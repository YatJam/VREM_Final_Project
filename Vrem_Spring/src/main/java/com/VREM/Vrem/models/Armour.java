package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
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

    public Armour(String armourType, int armourDefense) {
        this.armourType = armourType;
        this.armourDefense = armourDefense;
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
}
