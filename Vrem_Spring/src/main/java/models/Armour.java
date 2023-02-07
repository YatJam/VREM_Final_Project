package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "armours")
public class Armour {

    private Long id;
    private String armourType;
    private int armourDefense;
}
