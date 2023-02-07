package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "characterclasses")
public class CharacterClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "character_type")
    private String characterType;

    @Column(name = "character_health")
    private int characterHealth;

    @Column(name = "character_battlecry")
    private String characterBattlecry;

//    @OneToMany(mappedBy = "users")
//    @JsonManagedReference
//    private List<User> user;

    public CharacterClass(String characterType, int characterHealth, String characterBattlecry) {
        this.characterType = characterType;
        this.characterHealth = characterHealth;
        this.characterBattlecry = characterBattlecry;
//        this.user = new ArrayList<>();
    }

    public CharacterClass() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCharacterType() {
        return characterType;
    }

    public void setCharacterType(String characterType) {
        this.characterType = characterType;
    }

    public int getCharacterHealth() {
        return characterHealth;
    }

    public void setCharacterHealth(int characterHealth) {
        this.characterHealth = characterHealth;
    }

    public String getCharacterBattlecry() {
        return characterBattlecry;
    }

    public void setCharacterBattlecry(String characterBattlecry) {
        this.characterBattlecry = characterBattlecry;
    }

//    public List<User> getUser() {
//        return user;
//    }
//
//    public void setUser(List<User> user) {
//        this.user = user;
//    }
}
