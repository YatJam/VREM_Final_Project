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
        CharacterClass amazon = new CharacterClass("Amazon", 120, "I am Amazon");
        characterClassRepository.save(amazon);

        CharacterClass dwarf = new CharacterClass("Dwarf", 400, "I am going to chin you");
        characterClassRepository.save(dwarf);

        CharacterClass outcast = new CharacterClass("Outcast", 110, "I am Outcast");
        characterClassRepository.save(outcast);

        CharacterClass paladin = new CharacterClass("Paladin", 140, "I am Paladin");
        characterClassRepository.save(paladin);

        CharacterClass warlock = new CharacterClass("Warlock", 100, "I am Warlock");
        characterClassRepository.save(warlock);

        Weapon barehands = new Weapon("Bare Hands", 5);
        weaponRepository.save(barehands);

        Weapon sword = new Weapon("sword", 40);
        weaponRepository.save(sword);

        Weapon axe = new Weapon("axe", 60);
        weaponRepository.save(axe);

        Armour rags = new Armour("Rags", 1);
        armourRepository.save(rags);

        User john = new User("John", dwarf, rags, barehands);
        userRepository.save(john);

        User jackie = new User("Jackie", dwarf, rags, barehands);
        userRepository.save(jackie);

        User ewa = new User("Ewa", dwarf, rags, barehands);
        userRepository.save(ewa);

        Choice se1 = new Choice("Continue", 1);
        Choice se2 = new Choice("...", 0);
        Choice se3 = new Choice("...", 0);
        Choice se4 = new Choice("...", 0);
        choiceRepository.save(se1);
        choiceRepository.save(se2);
        choiceRepository.save(se3);
        choiceRepository.save(se4);


        Event startEvent1 = new Event("Prelude", "You are rocked awake by the turbulence of the cart you are riding, bleary eyed, you feel the cold rasp against your skin.", "It is not a natural cold you feel.");
        eventRepository.save(startEvent1);

        startEvent1.addChoice(se1);
        startEvent1.addChoice(se2);
        startEvent1.addChoice(se3);
        startEvent1.addChoice(se4);
        eventRepository.save(startEvent1);

       Event startEvent2 = new Event("Prelude", "Wagon Driver: Hey, you are finally awake...", "...we are approaching a town, I won't take you any further.");
        eventRepository.save(startEvent2);

        Choice se5 = new Choice("Continue", 2);
        Choice se6 = new Choice("...", 1);
        Choice se7 = new Choice("...", 1);
        Choice se8 = new Choice("...", 1);
        choiceRepository.save(se5);
        choiceRepository.save(se6);
        choiceRepository.save(se7);
        choiceRepository.save(se8);

        startEvent2.addChoice(se5);
        startEvent2.addChoice(se6);
        startEvent2.addChoice(se7);
        startEvent2.addChoice(se8);
        eventRepository.save(startEvent2);

        Event startEvent3 = new Event("Prelude", "The wagon stumbles to a halt. The wagon driver, slowly looks over their shoulder whilst the ox grabs a restful breath.", "You find yourself at a crossroads.");
        eventRepository.save(startEvent3);

        Choice se9 = new Choice("Go to the village (North)", 3);
        Choice se10 = new Choice("Go to the lake (East)", 4);
        Choice se11 = new Choice("Follow the road west (West)", 5);
        Choice se12 = new Choice("...", 2);
        choiceRepository.save(se9);
        choiceRepository.save(se10);
        choiceRepository.save(se11);
        choiceRepository.save(se12);

        startEvent3.addChoice(se9);
        startEvent3.addChoice(se10);
        startEvent3.addChoice(se11);
        startEvent3.addChoice(se12);
        eventRepository.save(startEvent3);

        Event startEvent4 = new Event("The Village outskirts", "A solitary town guardsman, dishevelled in appearance, confronts you.", "STOJ! I cannot let you pass stranger, by order of the Ealdorman.");
        eventRepository.save(startEvent4);

        Choice se13 = new Choice("Return to crossroad", 6);
        Choice se14 = new Choice("Fight the guardsman", 7);
        Choice se15 = new Choice("...", 3);
        Choice se16 = new Choice("...", 3);
        choiceRepository.save(se13);
        choiceRepository.save(se14);
        choiceRepository.save(se15);
        choiceRepository.save(se16);

        startEvent4.addChoice(se13);
        startEvent4.addChoice(se14);
        startEvent4.addChoice(se15);
        startEvent4.addChoice(se16);
        eventRepository.save(startEvent4);


    }
}
