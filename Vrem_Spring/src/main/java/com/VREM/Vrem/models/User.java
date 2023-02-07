package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "player_name")
    private String playerName;

    @ManyToOne
    @JoinColumn(name = "characterclass_id", nullable = true)
    @JsonIgnoreProperties({"users"})
    private CharacterClass characterClass;

    @ManyToOne
    @JoinColumn(name = "armour_id", nullable = true)
    @JsonIgnoreProperties({"users"})
    private Armour playerArmour;

    @ManyToOne
    @JoinColumn(name = "weapon_id", nullable = true)
    @JsonIgnoreProperties({"users"})
    private Weapon playerWeapon;

    @OneToMany
    @JsonIgnoreProperties({"user"})
    @Column(name = "player_inventory")
    private List<Item> playerInventory;

    public User(String playerName, CharacterClass characterClass, Armour playerArmour, Weapon playerWeapon) {
        this.playerName = playerName;
        this.characterClass = characterClass;
        this.playerArmour = playerArmour;
        this.playerWeapon = playerWeapon;
        this.playerInventory = new ArrayList<>();
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Armour getPlayerArmour() {
        return playerArmour;
    }

    public void setPlayerArmour(Armour playerArmour) {
        this.playerArmour = playerArmour;
    }

    public Weapon getPlayerWeapon() {
        return playerWeapon;
    }

    public void setPlayerWeapon(Weapon playerWeapon) {
        this.playerWeapon = playerWeapon;
    }

    public List<Item> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(List<Item> playerInventory) {
        this.playerInventory = playerInventory;
    }

    public void addItem(Item item){
        this.playerInventory.add(item);
    }
}
