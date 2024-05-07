package com.example.icecream.domain.goal.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UpdateGoalDto {

    @NotNull
    private Integer goalId;
    @NotNull
    private Integer period;
    @NotNull
    private String content;
}
