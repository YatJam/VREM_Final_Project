package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.Enemy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnemyRepository extends JpaRepository<Enemy,Long> {
}
