package Game.GUI;

import Game.Pieces.*;
import Game.Rules.Turns;

import javax.swing.*;
import java.awt.*;


    public class Board extends JFrame{

        public Container contents;

        //Grid
        public static JButton [][]Tiles = new JButton[5][5];


        //Colours
        public Color White = Color.WHITE; //White Squares; by default the panel is white, not really needed
        public Color Black = Color.BLACK; //Black Squares


    public Board() {

        contents = getContentPane();

        //Size and Display Window
        int width = 1200;
        int height = 1200;
        setSize(width, height);
        setResizable(true);
        setLocationRelativeTo(null);//centres window
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        contents.setLayout(new GridLayout(5, 5));

                //Create and Add Board Components
                for (int i = 0; i < 5; i++) {//walks ranks

                    for (int j = 0; j < 5; j++) {//walks files

                        Tiles[i][j] = new JButton();//adds buttons on every tile

                        if ((i + j) % 2 != 0) {
                            Tiles[i][j].setBackground(Black);
                        } else {
                            Tiles[i][j].setBackground(White);
                        }//colours each tile alternating colours

                        contents.add(Tiles[i][j]);

                    }
                }

        //Initializing White Pieces
        new WhiteKing();
        new WhiteRook2();
        new WhitePawn3();


        //Initializing Black Pieces
        new BlackKing();
        new BlackRook1();
        new BlackPawn3();








    }//end of Board



}//end of class
