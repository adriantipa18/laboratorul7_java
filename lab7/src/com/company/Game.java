package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Game {
    private Board firstGame= new Board(5);
    List<Player> players = new ArrayList<Player>();
    int limitOfPlayers;

    Game(){ }

    Game(int limit,Board board, Player ... players){
        this.firstGame=board;
        this.limitOfPlayers=limit;
        if(this.limitOfPlayers<players.length){
            Collections.addAll(this.players,players);
        }
    }

    public void startGame(){
        Runnable firstPlayer= new Player("Adi");
        Runnable secondPlayer= new Player("Tibi");
        Runnable thirdPlayer= new Player("Stefan");
        Runnable fourthPlayer= new Player("Andrei");

        new Thread(firstPlayer).start();
        new Thread(secondPlayer).start();
        new Thread(thirdPlayer).start();
        new Thread(fourthPlayer).start();
    }
}
