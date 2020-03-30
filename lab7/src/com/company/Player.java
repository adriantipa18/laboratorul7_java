package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements Runnable {
    private final String name;
    private final List<Token> ownedTokens = new ArrayList<Token>();

    public Player(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.name+"  -->   merge");
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ownedTokens=" + ownedTokens +
                '}';
    }
}
