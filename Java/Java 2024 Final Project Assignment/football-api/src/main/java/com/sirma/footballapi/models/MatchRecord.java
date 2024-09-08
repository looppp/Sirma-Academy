package com.sirma.footballapi.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchRecord {

    @Id
    private Long id;

    @ManyToOne
    private Player player;

    @ManyToOne
    private Match match;

    private String fromMinutes;

    private String toMinutes;
}
