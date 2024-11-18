package com.recanto.GamerReview.mappers;

import com.recanto.GamerReview.model.Games;
import com.recanto.GamerReview.model.GamesData;

public interface MapperDTO<I, O> {
    Games dataToGamesMapper(GamesData gamesData);
    
}
