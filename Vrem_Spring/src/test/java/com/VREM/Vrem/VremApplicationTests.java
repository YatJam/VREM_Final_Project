package com.VREM.Vrem;

import com.VREM.Vrem.models.Armour;
import com.VREM.Vrem.repositories.*;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import repositories.*;

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



}
