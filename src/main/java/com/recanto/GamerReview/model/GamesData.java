package com.recanto.GamerReview.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GamesData {
    @JsonProperty("gameID")
    private String gameID;

    @JsonProperty("game_name")
    private String gameName;

    @JsonProperty("game_description")
    private String gameDescription;
    
    @JsonProperty("game_studio")
    private String gameStudio;
    
    @JsonProperty("game_release_date")
    private String gameReleaseDate;
}
