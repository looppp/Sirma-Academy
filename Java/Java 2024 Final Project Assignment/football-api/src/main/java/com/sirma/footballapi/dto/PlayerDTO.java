package com.sirma.footballapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PlayerDTO {
    private Long playerId1;
    private Long playerId2;
    private Long totalPlayedTime;
}
