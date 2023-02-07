package repositories;

import models.Armour;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArmourRepository extends JpaRepository<Armour, Long> {

    List<Armour> findArmourByArmourType(String armourType);

}

