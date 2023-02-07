package com.VREM.Vrem.components;

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
        
    }
}
