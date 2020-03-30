package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Board {
    private List<Token> board= new ArrayList<Token>();
    private int limit;

    Board(int limitOfTokens, Token... token){
        Collections.addAll(board, token);
        this.limit=limitOfTokens;
    }

    Board(){

    }

    Board(int limitOfTokens){
        this.limit=limitOfTokens;
    }

    public void Add(Token ...token){
        if(this.board.size()+token.length<=limit){
            Collections.addAll(board,token);
        }
        else
            System.out.println("elements was't added, limit reached");
    }
}
