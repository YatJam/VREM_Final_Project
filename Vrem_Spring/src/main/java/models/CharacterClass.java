package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "characterClasses")
public class CharacterClass {

    private Long id;
    private String characterType;
    private int characterHealth;
    private String characterBattlecry;

}
