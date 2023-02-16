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


        Event startEvent1 = new Event("Prelude", "You are rocked awake by the turbulence of the cart you are riding, bleary eyed, you feel the cold rasp against your skin.", "It is not a natural cold you feel.", "../assets/bridge.png");
        eventRepository.save(startEvent1);

        startEvent1.addChoice(se1);
        startEvent1.addChoice(se2);
        startEvent1.addChoice(se3);
        startEvent1.addChoice(se4);
        eventRepository.save(startEvent1);

       Event startEvent2 = new Event("Prelude", "Wagon Driver: Hey, you are finally awake...", "...we are approaching a town, I won't take you any further.", "../assets/bridge.png");
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

        Event startEvent3 = new Event("Crossroads", "The wagon stumbles to a halt. The wagon driver, slowly looks over their shoulder whilst the ox grabs a restful breath.", "You find yourself at a crossroads.", "../assets/bridge.png");
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

        Event startEvent4 = new Event("The Village outskirts", "A solitary town guardsman, dishevelled in appearance, confronts you.", "STOJ! I cannot let you pass stranger, by order of the Ealdorman.", "../assets/village.png");
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

        Event startEvent5 = new Event("The Mysterious Lake", "You arrive at the lake and notice it has an ethereal glow.", "What do you do?", "../assets/lake.png");
        eventRepository.save(startEvent5);

        Choice se17 = new Choice("Drink the water", 98);
        Choice se18 = new Choice("Rest", 98);
        Choice se19 = new Choice("Return to the crossroads", 6);
        Choice se20 = new Choice("...", 4);
        choiceRepository.save(se17);
        choiceRepository.save(se18);
        choiceRepository.save(se19);
        choiceRepository.save(se20);

        startEvent5.addChoice(se17);
        startEvent5.addChoice(se18);
        startEvent5.addChoice(se19);
        startEvent5.addChoice(se20);
        eventRepository.save(startEvent5);

        Event startEvent6 = new Event("The Road West", "You follow the road west and discover the aftermath of an ambush.", "What do you do?", "../assets/bridge.png");
        eventRepository.save(startEvent6);

        Choice se21 = new Choice("Investigate", 99);
        Choice se22 = new Choice("Go to sleep", 99);
        Choice se23 = new Choice("Turn around", 99);
        Choice se24 = new Choice("Do not turn around", 99);
        choiceRepository.save(se21);
        choiceRepository.save(se22);
        choiceRepository.save(se23);
        choiceRepository.save(se24);

        startEvent6.addChoice(se21);
        startEvent6.addChoice(se22);
        startEvent6.addChoice(se23);
        startEvent6.addChoice(se24);
        eventRepository.save(startEvent6);

        Event startEvent7 = new Event("The Crossroads", "You arrive at the crossroads from where your journey began.", "What do you do?", "../assets/bridge.png");
        eventRepository.save(startEvent7);

        Choice se25 = new Choice("Go to the village", 3);
        Choice se26 = new Choice("Go to the Lake", 4);
        Choice se27 = new Choice("Take the road West", 5);
        Choice se28 = new Choice("...", 6);
        choiceRepository.save(se25);
        choiceRepository.save(se26);
        choiceRepository.save(se27);
        choiceRepository.save(se28);

        startEvent7.addChoice(se25);
        startEvent7.addChoice(se26);
        startEvent7.addChoice(se27);
        startEvent7.addChoice(se28);
        eventRepository.save(startEvent7);

        Event startEvent8 = new Event("The Village", "You attack the guardsman but are immediately knocked to the ground by their superior martial prowess.", "What do you do?", "../assets/village.png");
        eventRepository.save(startEvent8);

        Choice se29 = new Choice("Go to the crossroads (crying)", 6);
        Choice se30 = new Choice("Attack again", 7);
        Choice se31 = new Choice("...", 7);
        Choice se32 = new Choice("...", 7);
        choiceRepository.save(se29);
        choiceRepository.save(se30);
        choiceRepository.save(se31);
        choiceRepository.save(se32);

        startEvent8.addChoice(se29);
        startEvent8.addChoice(se30);
        startEvent8.addChoice(se31);
        startEvent8.addChoice(se32);
        eventRepository.save(startEvent8);
    }
}
