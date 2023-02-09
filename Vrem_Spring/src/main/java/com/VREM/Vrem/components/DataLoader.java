package com.VREM.Vrem.components;

import com.VREM.Vrem.models.*;
import com.VREM.Vrem.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Profile("!test")
@Component
public class DataLoader implements ApplicationRunner{

    @Autowired
    ArmourRepository armourRepository;

    @Autowired
    CharacterClassRepository characterClassRepository;

    @Autowired
    ItemRepository itemRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    WeaponRepository weaponRepository;

    @Autowired
    ChoiceRepository choiceRepository;

    @Autowired
    EventRepository eventRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        CharacterClass Dwarf = new CharacterClass("Dwarf", 400, "I am going to chin you");
        characterClassRepository.save(Dwarf);

        Weapon barehands = new Weapon("Bare Hands", 5);
        weaponRepository.save(barehands);

        Armour rags = new Armour("Rags", 1);
        armourRepository.save(rags);

        User john = new User("John", Dwarf, rags, barehands);
        userRepository.save(john);

        User jackie = new User("Jackie", Dwarf, rags, barehands);
        userRepository.save(jackie);

        User ewa = new User("Ewa", Dwarf, rags, barehands);
        userRepository.save(ewa);

        Choice choice1 = new Choice("Attack", 2);
        Choice choice2 = new Choice("Search Room", 3);
        Choice choice3 = new Choice("Talk to Chicken", 4);
        Choice choice4 = new Choice("Leave room", 5);
        choiceRepository.save(choice1);
        choiceRepository.save(choice2);
        choiceRepository.save(choice3);
        choiceRepository.save(choice4);

        Event startEvent = new Event("Starting Event");
        eventRepository.save(startEvent);

        startEvent.addChoice(choice1);
        startEvent.addChoice(choice2);
        startEvent.addChoice(choice3);
        startEvent.addChoice(choice4);
        eventRepository.save(startEvent);

//        choice1.addEvent(startEvent);
//        choiceRepository.save(choice1);
//
//        choice2.addEvent(startEvent);
//        choiceRepository.save(choice2);
//
//        choice3.addEvent(startEvent);
//        choiceRepository.save(choice3);
//
//        choice4.addEvent(startEvent);
//        choiceRepository.save(choice4);
    }
}
