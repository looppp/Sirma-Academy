package com.sirma.footballapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Team {

    @Id
    @NotNull(message = "ID cannot be null")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Team name cannot be empty")
    @Size(min = 2, max = 100, message = "The team name must be between 2 and 100 characters long.")
    private String name;

    @NotBlank
    @Size(min = 10, max = 50, message = "The manager's full name must be between 10 and 50 characters long.")
    private String managerFullName;

    @NotBlank(message = "Team group cannot be empty")
    @Size(min = 1, max = 1, message = "Team group must be one character long")
    @Column(name = "team_group")
    private String group;

    @OneToMany(mappedBy = "team")
    private Set<Player> players;


}
