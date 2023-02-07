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

}
