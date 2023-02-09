package com.VREM.Vrem.models;

import javax.persistence.*;

@Entity
@Table(name = "npcs")
public class NPC {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "npc_name")
    private String npcName;

    @Column(name = "npc_health")
    private int npcHealth;

    @Column(name = "npc_damage")
    private int npcDamage;

    @Column(name = "npc_battlecry")
    private String npcBattlecry;

    public NPC(String npcName, int npcHealth, int npcDamage, String npcBattlecry) {
        this.npcName = npcName;
        this.npcHealth = npcHealth;
        this.npcDamage = npcDamage;
        this.npcBattlecry = npcBattlecry;
    }

    public NPC() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNpcName() {
        return npcName;
    }

    public void setNpcName(String npcName) {
        this.npcName = npcName;
    }

    public int getNpcHealth() {
        return npcHealth;
    }

    public void setNpcHealth(int npcHealth) {
        this.npcHealth = npcHealth;
    }

    public int getNpcDamage() {
        return npcDamage;
    }

    public void setNpcDamage(int npcDamage) {
        this.npcDamage = npcDamage;
    }

    public String getNpcBattlecry() {
        return npcBattlecry;
    }

    public void setNpcBattlecry(String npcBattlecry) {
        this.npcBattlecry = npcBattlecry;
    }
}
