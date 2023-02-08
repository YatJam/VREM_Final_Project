package com.VREM.Vrem.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
    @Column (name = "event_options")
    private List<Choice> options;

    public Event(String eventStory, List<Choice> options) {
        this.eventStory = eventStory;
        this.options = new ArrayList<>();
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

    public List<Choice> getOptions() {
        return options;
    }

    public void setOptions(List<Choice> options) {
        this.options = options;
    }

    public void add(Choice option){
        this.options.add(option);
    }
}
