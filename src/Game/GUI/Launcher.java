package Game.GUI;

import Game.Pieces.*;
import Game.States.Players;

public class Launcher {

    public static void main(String[] args) {

        //GUI
        new Board();

        //Initializing White Pieces
        new WhiteKing();
        new WhiteRook2();
        new WhitePawn3();


        //Initializing Black Pieces
        new BlackKing();
        new BlackRook1();
        new BlackPawn3();

        //Game Rules
        new Players();

    }

}
