package com.recanto.GamerReview.vision;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.recanto.GamerReview.control.GamesFunctions;
import com.recanto.GamerReview.mappers.MapperDTO;
import com.recanto.GamerReview.model.Games;
import com.recanto.GamerReview.model.GamesData;

@RestController
public class TesterView {
    
    private GamesFunctions gamesFunctions = new GamesFunctions();
    private ObjectMapper mapper = new ObjectMapper();
    private MapperDTO<GamesData, Games> mapperDTO;

    @RequestMapping(value = "/getAllGames", method = RequestMethod.GET)
    public List<Games> getAllGames() {
        return gamesFunctions.getAllGames();
    }

    @RequestMapping(value = "/getGameByID/{id}", method = RequestMethod.GET)
    public Games getGameByID(@PathVariable(value = "id") int id) {
        return gamesFunctions.getGameById(id);
    }

    @RequestMapping(value = "/addGame", method = RequestMethod.POST, consumes = "application/json")
    public String addGame(@RequestBody String newGame) throws JsonMappingException, JsonProcessingException {
        System.out.println(newGame);


        GamesData gameData = mapper.readValue(newGame, GamesData.class);

        System.out.println("Deu bom");
        gamesFunctions.addGame(mapperDTO.dataToGamesMapper(gameData));
        return "Criado com sucesso";
    }

    @RequestMapping(value = "/injetoraTeste", method = RequestMethod.POST)
    public HttpStatus injetora(){
        gamesFunctions.injetoraTeste();
        return HttpStatus.OK;
    }
}
