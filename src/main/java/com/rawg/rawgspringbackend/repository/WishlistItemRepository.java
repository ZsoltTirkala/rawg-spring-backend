package com.rawg.rawgspringbackend.repository;

import com.rawg.rawgspringbackend.entity.WishlistItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WishlistItemRepository extends JpaRepository<WishlistItem, Long> {

}
