package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findUserByPlayerName(String playerName);
}
