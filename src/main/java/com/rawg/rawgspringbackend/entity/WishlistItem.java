package com.rawg.rawgspringbackend.entity;


import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Builder
public class WishlistItem {

    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private Long gameId;
    private String name;
    private String background_image;
    private String released;
    private double rating;


    @ManyToMany
    private Set<RawGUser> likes;
}
