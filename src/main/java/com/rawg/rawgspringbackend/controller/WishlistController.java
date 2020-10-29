package com.rawg.rawgspringbackend.controller;

import com.rawg.rawgspringbackend.entity.WishlistItem;
import com.rawg.rawgspringbackend.service.RawGAPIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class WishlistController {

    @Autowired
    RawGAPIService rawGAPIService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/api/wishlist")
    public List<WishlistItem> gameList() {
        return rawGAPIService.getWishlist();
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/api/wishlist/add")
    public void addToWishlist(WishlistItem item) {
        rawGAPIService.addWishListItem(item);
    }

}
