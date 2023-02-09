package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.NPC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NPCRepository extends JpaRepository<NPC,Long> {
}
