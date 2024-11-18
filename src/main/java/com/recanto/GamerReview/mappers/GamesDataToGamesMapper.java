package com.recanto.GamerReview.mappers;

import java.time.LocalDate;

import com.recanto.GamerReview.model.Games;
import com.recanto.GamerReview.model.GamesData;

@SuppressWarnings("rawtypes")
public class GamesDataToGamesMapper implements MapperDTO {

    @Override
    public Games dataToGamesMapper(GamesData gameData) {
        return Games.builder()
            .gameID(Integer.parseInt(gameData.getGameID()))
            .gameName(gameData.getGameName())
            .gameDescription(gameData.getGameDescription())
            .gameStudio(gameData.getGameStudio())
            .gameReleaseDate(LocalDate.parse(gameData.getGameReleaseDate()))
            .build();
    }

}
