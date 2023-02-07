package com.VREM.Vrem.models;

import javax.persistence.*;

@Entity
@Table(name = "choices")
public class Choice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "choice_type")
    private String choiceType;

    @Column(name = "exit_id")
    private int exitId;

    public Choice(String choiceType, int exitId) {
        this.choiceType = choiceType;
        this.exitId = exitId;
    }

    public Choice() {
    }

    public String getChoiceType() {
        return choiceType;
    }

    public void setChoiceType(String choiceType) {
        this.choiceType = choiceType;
    }

    public int getExitId() {
        return exitId;
    }

    public void setExitId(int exitId) {
        this.exitId = exitId;
    }
}
