package repositories;

import models.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterClassRepository extends JpaRepository<CharacterClass, Long> {

    List<CharacterClass> findCharacterClassByCharacterType(String characterType);
}
