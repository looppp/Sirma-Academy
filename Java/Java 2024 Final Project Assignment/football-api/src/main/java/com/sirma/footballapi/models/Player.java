package com.sirma.footballapi.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Team number cannot be null")
    @Min(value = 1, message = "Team number must be greater than 0")
    @Max(value = 99, message = "Team number must be less than 100")
    private Integer teamNumber;

    @NotBlank(message = "Team position cannot be null")
    @Size(min = 2, max = 25, message = "Position is between 2 and 25 characters long")
    private String position;

    @NotBlank(message = "FullName cannot be null")
    @Size(min = 3, max = 50, message = "FullName must be between 3 and 50 characters long")
    private String fullName;

    @ManyToOne
    private Team team;
}

