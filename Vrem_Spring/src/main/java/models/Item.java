package models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "items")
public class Item {
    private Long id;
    private String itemType;
    private int itemValue;
}
