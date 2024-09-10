package com.sirma.footballapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {

    @Id
    @NotNull(message = "ID cannot be null")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Match date cannot be empty")
    private LocalDate date;

    @NotBlank(message = "Match score cannot be empty")
    private String score;

    @ManyToOne
    private Team aTeam;

    @ManyToOne
    private Team bTeam;

    @OneToMany(mappedBy = "match")
    private Set<MatchRecord> matchRecords;
}
