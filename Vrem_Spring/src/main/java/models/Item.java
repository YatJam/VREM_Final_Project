package models;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_type")
    private String itemType;

    @Column(name = "item_value")
    private int itemValue;
}
