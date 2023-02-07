package com.VREM.Vrem.components;

import com.VREM.Vrem.models.Armour;
import com.VREM.Vrem.models.CharacterClass;
import com.VREM.Vrem.models.User;
import com.VREM.Vrem.models.Weapon;
import com.VREM.Vrem.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

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

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        CharacterClass Dwarf = new CharacterClass("Dwarf", 400, "I am going to chin you");
        characterClassRepository.save(Dwarf);

        Weapon barehands = new Weapon("Bare Hands", 5);
        weaponRepository.save(barehands);

        Armour rags = new Armour("Rags", 1);
        armourRepository.save(rags);

        User John = new User("John", Dwarf, rags, barehands);
        userRepository.save(John);
    }
}
