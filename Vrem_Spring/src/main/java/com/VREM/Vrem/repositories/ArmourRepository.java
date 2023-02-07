package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.Armour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmourRepository extends JpaRepository<Armour, Long> {

    List<Armour> findArmourByArmourType(String armourType);

}

