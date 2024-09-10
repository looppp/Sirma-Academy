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

    public Match(LocalDate date, String score, Team aTeam, Team bTeam, Set<MatchRecord> matchRecords) {
        this.date = date;
        this.score = score;
        this.aTeam = aTeam;
        this.bTeam = bTeam;
        this.matchRecords = matchRecords;
    }
}
