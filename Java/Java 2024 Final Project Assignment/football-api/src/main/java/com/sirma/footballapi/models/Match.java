package com.sirma.footballapi.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Match {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String date;

    private String score;

    @ManyToOne
    private Team aTeam;

    @ManyToOne
    private Team bTeam;

    @OneToMany(mappedBy = "match")
    private Set<Record> records;
}
