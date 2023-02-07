package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.CharacterClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterClassRepository extends JpaRepository<CharacterClass, Long> {

    List<CharacterClass> findCharacterClassByCharacterType(String characterType);
}
