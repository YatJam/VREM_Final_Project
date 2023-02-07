package models;

import javax.persistence.*;

@Entity
@Table(name = "characterClasses")
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

    public CharacterClass(String characterType, int characterHealth, String characterBattlecry) {
        this.characterType = characterType;
        this.characterHealth = characterHealth;
        this.characterBattlecry = characterBattlecry;
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
}
