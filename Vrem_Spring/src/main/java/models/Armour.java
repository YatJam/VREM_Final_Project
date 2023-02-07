package models;

import javax.persistence.*;

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
}
