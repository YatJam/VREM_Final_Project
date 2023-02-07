package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.CharacterClass;
import com.VREM.Vrem.models.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
