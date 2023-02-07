package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.CharacterClass;
import com.VREM.Vrem.models.Choice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends JpaRepository<Choice, Long> {
}
