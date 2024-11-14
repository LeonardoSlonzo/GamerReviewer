package com.recanto.GamerReview.control;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.recanto.GamerReview.model.Games;

//TODO get all, get by id, get by name, post game (superUser)
public class GamesFunctions {
    
    List<Games> gameList = new ArrayList<>();
    
    public List<Games> getAllGames(){
        return gameList;
    }

    public Games getGameById(int gameID){
        //Games game = gameList.stream().filter(g -> g.getGameID() == gameID).findFirst().orElse(null);  
        for(int i = 0; i < gameList.size(); i++)
            if( gameList.get(i).equals(gameID) )
                return gameList.get(i);

        return null;
    }


    public void injetoraTeste(){
        gameList.add(Games.builder()
        .gameID(1)
        .gameName("Porradaria 2: Pagode of the Night")
        .gameDescription("O Ninja está de volta! Desta vez a procura do Lendário Saco de Batatas Fritas Infinitas!!")
        .gameStudio("CleanWaterSoft")
        .gameReleaseDate(LocalDate.parse("2015-03-12"))
        .build());

        gameList.add(Games.builder()
        .gameID(2)
        .gameName("AVIÃOZINHO DO TRÁFICO 3:ABRI UM PORTAL PRO INFERNO NA FAVELA TENTANDO REVIVER MIT AIA E PRECISO FECHAR")
        .gameDescription("A BRAZILIAN BOOMER SHOOTER GAME MADE USING THE ID TECH 2 ENGINE! SHOOT, JUMP, EMBARK ON A JOURNEY THROUGHOUT THE STATE OF RIO DE JANEIRO, HELL AND EVEN HEAVEN! SAVE BRAZIL!")
        .gameStudio("Joevento")
        .gameReleaseDate(LocalDate.parse("2024-09-21"))
        .build());

        gameList.add(Games.builder()
        .gameID(3)
        .gameName("Mineirinho Director's Cut")
        .gameDescription("A really cool 3d platform game, lots of extreme adventures with our friend Miner, now we have the option Double Miner and the adventure gets a lot cooler. Director's Cut version has unpublished scenes that have never been seen.")
        .gameStudio("Sinned Games")
        .gameReleaseDate(LocalDate.now())
        .build());
    }

}
