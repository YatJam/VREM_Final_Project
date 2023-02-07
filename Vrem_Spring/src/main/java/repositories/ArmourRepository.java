package repositories;

import models.Armour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArmourRepository extends JpaRepository<Armour, Long> {

}

