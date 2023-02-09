package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_story")
    private String eventStory;

    @ManyToMany
    @JsonIgnoreProperties({"events"})
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @JoinTable(
            name = "event_choices",
            joinColumns = { @JoinColumn(
                    name = "event_id",
                    nullable = false,
                    updatable = false)
            },
            inverseJoinColumns = { @JoinColumn(
                    name = "choice_id",
                    nullable = false,
                    updatable = false)
            }
    )
    private List<Choice> choices;

    public Event(String eventStory) {
        this.eventStory = eventStory;
        this.choices = new ArrayList<>();
    }

    public Event() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEventStory() {
        return eventStory;
    }

    public void setEventStory(String eventStory) {
        this.eventStory = eventStory;
    }

    public List<Choice> getChoices() {
        return choices;
    }

    public void setChoices(List<Choice> choices) {
        this.choices = choices;
    }

    public void addChoice(Choice choice){
        this.choices.add(choice);
    }
}
