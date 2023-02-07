package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.Weapon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {

    List<Weapon> findWeaponByWeaponType(String weaponType);
}
