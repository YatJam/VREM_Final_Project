package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "weapons")
public class Weapon {
    private Long id;
    private String weaponType;
    private int weaponDamage;
}
