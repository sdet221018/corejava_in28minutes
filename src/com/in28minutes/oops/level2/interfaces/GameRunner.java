package com.in28minutes.oops.level2.interfaces;

public class GameRunner {

        public static void main(String[] args){
        GamingConsole game = new MarioGame();
//        GamingConsole game = new ChessGame();

        game.up();
        game.down();
        game.left();
        game.right();
        }
}
