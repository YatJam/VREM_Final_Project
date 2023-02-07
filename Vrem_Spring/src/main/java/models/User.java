package models;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

private Long id;
private String playerName;
private CharacterClass characterClass;
private Armour playerArmour;
private Weapon playerWeapon;
private List<Item> playerinventory;


}
