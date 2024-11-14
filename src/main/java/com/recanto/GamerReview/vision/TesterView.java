package com.recanto.GamerReview.vision;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.recanto.GamerReview.control.GamesFunctions;
import com.recanto.GamerReview.model.Games;

@RestController
public class TesterView {
    
    private GamesFunctions gamesFunctions = new GamesFunctions();

    @RequestMapping(value = "/getAllGames", method = RequestMethod.GET)
    public List<Games> GetAllGames() {
        gamesFunctions.injetoraTeste();
        return gamesFunctions.getAllGames();
    }

    @RequestMapping(value = "/getGameByID/{id}", method = RequestMethod.GET)
    public Games GetGameByID(@PathVariable(value = "id") int id) {
        gamesFunctions.injetoraTeste();
        return gamesFunctions.getGameById(id);
    }


}
