package com.sirma.footballapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String managerFullName;

    private String group;

    @OneToMany(mappedBy = "team")
    private Set<Player> players;




}
