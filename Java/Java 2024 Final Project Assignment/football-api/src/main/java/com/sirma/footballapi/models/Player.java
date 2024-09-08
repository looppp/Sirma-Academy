package com.sirma.footballapi.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    private Long id;

    private Integer teamNumber;

    private String position;

    private String fullName;

    @ManyToOne
    private Team team;

}
