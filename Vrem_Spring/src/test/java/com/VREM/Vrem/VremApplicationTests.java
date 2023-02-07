package com.VREM.Vrem;

import org.junit.jupiter.api.Test;
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

}
