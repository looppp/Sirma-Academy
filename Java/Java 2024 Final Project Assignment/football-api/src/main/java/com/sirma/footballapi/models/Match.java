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

    @NotNull(message = "Match date cannot be empty")
    private LocalDate date;

    @NotBlank(message = "Match score cannot be empty")
    private String score;

    @ManyToOne
    @JoinColumn(name = "a_team_id")
    @NotNull
    private Team aTeam;

    @ManyToOne
    @JoinColumn(name = "b_team_id")
    @NotNull
    private Team bTeam;

    @OneToMany(mappedBy = "match", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<MatchRecord> matchRecords;

    public Match(LocalDate date, String score, Team aTeam, Team bTeam, Set<MatchRecord> matchRecords) {
        this.date = date;
        this.score = score;
        this.aTeam = aTeam;
        this.bTeam = bTeam;
        this.matchRecords = matchRecords;
    }
}
