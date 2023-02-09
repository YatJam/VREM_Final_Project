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

        Choice choice1 = new Choice("Go to Event 1", 1);
        Choice choice2 = new Choice("Go to Event 2", 2);
        Choice choice3 = new Choice("Go to Event 3", 3);
        Choice choice4 = new Choice("Go to Event 4", 4);
        choiceRepository.save(choice1);
        choiceRepository.save(choice2);
        choiceRepository.save(choice3);
        choiceRepository.save(choice4);

        Event testEvent1 = new Event("This is the first test event");
        eventRepository.save(testEvent1);

        testEvent1.addChoice(choice1);
        testEvent1.addChoice(choice2);
        testEvent1.addChoice(choice3);
        testEvent1.addChoice(choice4);
        eventRepository.save(testEvent1);

       Event testEvent2 = new Event("This is the second test event");
        eventRepository.save(testEvent2);

        testEvent2.addChoice(choice1);
        testEvent2.addChoice(choice2);
        testEvent2.addChoice(choice3);
        testEvent2.addChoice(choice4);
        eventRepository.save(testEvent2);

        Event testEvent3 = new Event("This is the third test event");
        eventRepository.save(testEvent3);

        testEvent3.addChoice(choice1);
        testEvent3.addChoice(choice2);
        testEvent3.addChoice(choice3);
        testEvent3.addChoice(choice4);
        eventRepository.save(testEvent3);

        Event testEvent4 = new Event("This is the fourth test event");
        eventRepository.save(testEvent4);

        testEvent4.addChoice(choice1);
        testEvent4.addChoice(choice2);
        testEvent4.addChoice(choice3);
        testEvent4.addChoice(choice4);
        eventRepository.save(testEvent4);

    }
}
