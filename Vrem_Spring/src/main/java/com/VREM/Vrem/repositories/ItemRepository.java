package com.VREM.Vrem.repositories;

import com.VREM.Vrem.models.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    List<Item> findItemByItemType(String itemType);
}
