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

    @Column(name = "event_title")
    private String eventTitle;

    @Column(name = "event_story1")
    private String eventStory1;

    @Column(name = "event_story2")
    private String eventStory2;

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

    public Event(String eventTitle, String eventStory1, String eventStory2) {
        this.eventTitle = eventTitle;
        this.eventStory1 = eventStory1;
        this.eventStory2 = eventStory2;
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

    public String getEventStory1() {
        return eventStory1;
    }

    public void setEventStory1(String eventStory1) {
        this.eventStory1 = eventStory1;
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

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventStory2() {
        return eventStory2;
    }

    public void setEventStory2(String eventStory2) {
        this.eventStory2 = eventStory2;
    }
}
