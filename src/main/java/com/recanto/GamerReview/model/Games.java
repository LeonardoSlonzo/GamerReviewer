package com.recanto.GamerReview.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Games {
    private int gameID;
    private String gameName;
    private String gameDescription;
    private String gameStudio;
    private LocalDate gameReleaseDate;
}
