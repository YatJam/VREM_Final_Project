package com.VREM.Vrem;

import com.VREM.Vrem.models.*;
import com.VREM.Vrem.repositories.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
class VremApplicationTests {

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

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddArmourToDataBase(){
		Armour leatherArmour = new Armour("Leather Armour", 10);
		armourRepository.save(leatherArmour);
	}

	@Test
	public void canAddWeaponItemCharacterClassToDB(){
		Weapon sword = new Weapon("Sword", 42);
		weaponRepository.save(sword);

		Item key = new Item("Key", 1);
		itemRepository.save(key);

		CharacterClass Dwarf = new CharacterClass("Dwarf", 120, "I am going to stab you");
		characterClassRepository.save(Dwarf);
	}

	@Test
	public void canCreateStarterCharacter(){
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
